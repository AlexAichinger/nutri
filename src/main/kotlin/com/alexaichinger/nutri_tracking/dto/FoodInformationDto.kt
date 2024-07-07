package com.alexaichinger.nutri_tracking.dto

import com.alexaichinger.nutri_tracking.model.FoodInformation

data class FoodInformationDto(
    var name: String,
    var barcode: String,
    var nutritionInformation: NutritionInformationDto,
)

fun FoodInformationDto.toEntity(): FoodInformation {
    return FoodInformation(
        name = name,
        barcode = barcode,
        nutritionInformation = nutritionInformation.toEntity()
    )
}