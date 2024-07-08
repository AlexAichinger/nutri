package com.alexaichinger.nutritracking.service.openfoodfacts

import com.alexaichinger.nutritracking.configuration.OpenFoodFactsConfig
import com.alexaichinger.nutritracking.dto.external.openfoodfacts.v3.OffV3Dto
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.info.BuildProperties
import org.springframework.context.annotation.Bean
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.client.RestClient

@Service
@EnableConfigurationProperties(OpenFoodFactsConfig::class)
open class FoodFactsRestClientService(
    private val openFoodFactsConfig: OpenFoodFactsConfig,
    private val buildProperties: BuildProperties,
) {
    @Bean
    fun getRestClient(): RestClient {
        return RestClient.builder()
            .baseUrl(openFoodFactsConfig.baseUrl)
            .defaultHeader(
                HttpHeaders.USER_AGENT,
                "Nutri Tracking - ${System.getProperty("os.name")} - ${buildProperties.version}",
            ).build()
    }

    fun getProduct(barcode: String): OffV3Dto? {
        val uri = "/api/v3/product/$barcode.json"

        return getRestClient()
            .get()
            .uri(uri)
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .body(OffV3Dto::class.java)
    }
}
