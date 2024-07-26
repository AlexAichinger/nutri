package com.alexaichinger.nutritracking.model

import java.math.BigDecimal

data class MacroNutrients(
    val eatenGrams: BigDecimal? = null,
    val carbohydrates: BigDecimal? = null,
    val carbohydratesUnit: String? = null,
    val energyKcal: BigDecimal? = null,
    val fat: BigDecimal? = null,
    val fatUnit: String? = null,
    val fiber: BigDecimal? = null,
    val fiberUnit: String? = null,
    val fruitsVegetablesLegumesEstimateFromIngredients100g: BigDecimal? = null,
    val fruitsVegetablesLegumesEstimateFromIngredientsServing: BigDecimal? = null,
    val fruitsVegetablesNutsEstimateFromIngredients100g: BigDecimal? = null,
    val fruitsVegetablesNutsEstimateFromIngredientsServing: BigDecimal? = null,
    val proteins: BigDecimal? = null,
    val proteinsUnit: String? = null,
    val salt: BigDecimal? = null,
    val saltUnit: String? = null,
    val saturatedFat: BigDecimal? = null,
    val saturatedFatUnit: String? = null,
    val sodium: BigDecimal? = null,
    val sodiumUnit: String? = null,
    val sugars: BigDecimal? = null,
    val sugarsUnit: String? = null,
)
