package com.alexaichinger.nutritracking.dto.internal

import com.alexaichinger.nutritracking.model.FoodInformation

data class FoodInformationDto(
    var name: String,
    var barcode: String,
    var nutritionInformation: NutritionInformationDto,
)

fun FoodInformationDto.toEntity(): FoodInformation {
    return FoodInformation(
        name = name,
        barcode = barcode,
        nutritionInformation = nutritionInformation.toEntity(),
    )
}
