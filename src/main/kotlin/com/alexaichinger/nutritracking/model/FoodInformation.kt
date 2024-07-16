package com.alexaichinger.nutritracking.model


data class FoodInformation(
    var name: String,
    var brand: String? = null,
    var barcode: String? = null,
    var macroNutrients: MacroNutrients,
    var microNutrients: MicroNutrients,
)
