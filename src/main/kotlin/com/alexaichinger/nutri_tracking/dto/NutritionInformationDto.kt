package com.alexaichinger.nutri_tracking.dto

import com.alexaichinger.nutri_tracking.model.NutritionInformation
import java.math.BigDecimal

data class NutritionInformationDto(
    var calories: BigDecimal,
    var servingSize: BigDecimal? = null,
    var protein: BigDecimal? = null,
    var fat: BigDecimal? = null,
    var carbs: BigDecimal? = null,
    var fiber: BigDecimal? = null,
    var addedSugar: BigDecimal? = null,
    var naturalSugar: BigDecimal? = null,
    var saturatedFat: BigDecimal? = null,
    val unsaturatedFat: BigDecimal? = null,
    var sodium: BigDecimal? = null,
    var cholestral: BigDecimal? = null,
    var potassium: BigDecimal? = null,
)

fun NutritionInformationDto.toEntity(): NutritionInformation {
    return NutritionInformation(
        calories = calories,
        servingSize = servingSize,
        protein = protein,
        fat = fat,
        carbs = carbs,
        fiber = fiber,
        addedSugar = addedSugar,
        naturalSugar = naturalSugar,
        saturatedFat = saturatedFat,
        unsaturatedFat = unsaturatedFat,
        sodium = sodium,
        cholestral = cholestral,
        potassium = potassium,
    )
}
