package com.alexaichinger.nutritracking.configuration

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "open-food-facts")
data class OpenFoodFactsConfig(
    val baseUrl: String,
)
