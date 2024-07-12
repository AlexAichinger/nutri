package com.alexaichinger.nutritracking.model

import java.math.BigDecimal

data class MacroNutrients(
    var servingSizeG: BigDecimal,
    var carbohydrates: BigDecimal,
    var carbohydratesUnit: String,
    var energyKcal: BigDecimal,
    var fat: BigDecimal,
    var fatUnit: String,
    var fiber: BigDecimal,
    var fiberUnit: String,
    var fruitsVegetablesLegumesEstimateFromIngredients100g: BigDecimal,
    var fruitsVegetablesLegumesEstimateFromIngredientsServing: BigDecimal,
    var fruitsVegetablesNutsEstimateFromIngredients100g: BigDecimal,
    var fruitsVegetablesNutsEstimateFromIngredientsServing: BigDecimal,
    var proteins: BigDecimal,
    var proteinsUnit: String,
    var salt: BigDecimal,
    var saltUnit: String,
    var saturatedFat: BigDecimal,
    var saturatedFatUnit: String,
    var unSaturatedFat: BigDecimal,
    var unSaturatedFatUnit: String,
    var sodium: BigDecimal,
    var sodiumUnit: String,
    var sugars: BigDecimal,
    var sugarsUnit: String,
)
