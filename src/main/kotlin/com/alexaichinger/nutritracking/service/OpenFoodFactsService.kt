package com.alexaichinger.nutritracking.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.stereotype.Service

@Service
class OpenFoodFactsService(
    private val restClient: FoodFactsRestClientService,
) {
    private val log: Logger = LoggerFactory.getLogger(javaClass)
    private val client = restClient.getRestClient()

    fun getProductInfo(barcode: String): String? {
        val uri = "product/$barcode.json"
        val body = client.get()
            .uri(uri)
            .accept(MediaType.APPLICATION_JSON)

        log.info(body.retrieve().body(String::class.java))
        return body.retrieve().body(String::class.java)
    }
}
