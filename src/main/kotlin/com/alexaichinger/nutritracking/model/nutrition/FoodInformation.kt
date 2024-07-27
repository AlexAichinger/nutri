package com.alexaichinger.nutritracking.model.nutrition

data class FoodInformation(
    var name: String? = null,
    var brand: String? = null,
    var barcode: String? = null,
    var macroNutrients: MacroNutrients,
    var microNutrients: MicroNutrients,
)
