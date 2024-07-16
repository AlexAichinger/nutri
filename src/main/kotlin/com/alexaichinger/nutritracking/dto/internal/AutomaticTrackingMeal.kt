package com.alexaichinger.nutritracking.dto.internal

import com.alexaichinger.nutritracking.model.MealType
import com.fasterxml.jackson.annotation.JsonFormat
import java.math.BigDecimal
import java.time.LocalDate

data class AutomaticTrackingMeal(
    val user: String,
    val mealType: MealType,
    val eatenInGrams: BigDecimal,
    @JsonFormat(pattern = "yyyy-MM-dd")
    val loggingDate: LocalDate,
    val barcode: String,
)
