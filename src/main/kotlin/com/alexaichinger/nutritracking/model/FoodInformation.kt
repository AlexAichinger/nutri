package com.alexaichinger.nutritracking.model

data class FoodInformation(
    var name: String,
    var barcode: String,
    var nutritionInformation: NutritionInformation,
)
