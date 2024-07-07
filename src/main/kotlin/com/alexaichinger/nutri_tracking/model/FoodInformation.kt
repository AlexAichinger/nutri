package com.alexaichinger.nutri_tracking.model

data class FoodInformation(
    var name: String,
    var barcode: String,
    var nutritionInformation: NutritionInformation,
)
