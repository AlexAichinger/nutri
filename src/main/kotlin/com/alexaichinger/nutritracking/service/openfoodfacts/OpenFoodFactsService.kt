package com.alexaichinger.nutritracking.service.openfoodfacts

import com.alexaichinger.nutritracking.dto.external.client.ClientProductInfo
import com.alexaichinger.nutritracking.dto.external.client.toClientDto
import com.alexaichinger.nutritracking.dto.external.openfoodfacts.v3.OffV3Dto
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.web.client.HttpClientErrorException

@Service
class OpenFoodFactsService(
    private val openFoodFactsClient: FoodFactsRestClientService,
) {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    fun getProductInfo(barcode: String): ClientProductInfo? {
        return try {
            val productResponse = openFoodFactsClient.getProduct(barcode)
            return productResponse!!.toClientDto()
        } catch (e: HttpClientErrorException) {
            when {
                e.statusCode.is4xxClientError -> handle4xxError(barcode, e)
                e.statusCode.is5xxServerError -> handle5xxError(barcode, e)
            }
            null
        }
    }

    private fun handle5xxError(
        barcode: String,
        e: HttpClientErrorException,
    ) {
        log.error("Error occurred during call for $barcode.", e)
    }

    private fun handle4xxError(
        barcode: String,
        e: HttpClientErrorException,
    ) {
        log.debug("Call made for product with barcode: $barcode was not found.", e)
    }
}
