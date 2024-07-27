package com.alexaichinger.nutritracking.dto.internal

import com.alexaichinger.nutritracking.model.nutrition.MealType
import com.fasterxml.jackson.annotation.JsonFormat
import java.math.BigDecimal
import java.time.LocalDateTime

data class AutomaticTrackingMeal(
    val user: String,
    val mealType: MealType,
    val eatenInGrams: BigDecimal,
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssz")
    val loggingDate: LocalDateTime,
    val barcode: String,
)
