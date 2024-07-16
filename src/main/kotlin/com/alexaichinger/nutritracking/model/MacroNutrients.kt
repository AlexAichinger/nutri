package com.alexaichinger.nutritracking.model

import java.math.BigDecimal

data class MacroNutrients(
    val eatenGrams: BigDecimal,
    val carbohydrates: BigDecimal,
    val carbohydratesUnit: String,
    val energyKcal: BigDecimal,
    val fat: BigDecimal,
    val fatUnit: String,
    val fiber: BigDecimal,
    val fiberUnit: String,
    val fruitsVegetablesLegumesEstimateFromIngredients100g: BigDecimal,
    val fruitsVegetablesLegumesEstimateFromIngredientsServing: BigDecimal,
    val fruitsVegetablesNutsEstimateFromIngredients100g: BigDecimal,
    val fruitsVegetablesNutsEstimateFromIngredientsServing: BigDecimal,
    val proteins: BigDecimal,
    val proteinsUnit: String,
    val salt: BigDecimal,
    val saltUnit: String,
    val saturatedFat: BigDecimal,
    val saturatedFatUnit: String,
    val sodium: BigDecimal,
    val sodiumUnit: String,
    val sugars: BigDecimal,
    val sugarsUnit: String,
)
