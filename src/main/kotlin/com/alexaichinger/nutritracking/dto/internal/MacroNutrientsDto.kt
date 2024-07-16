package com.alexaichinger.nutritracking.dto.internal

import java.math.BigDecimal

data class MacroNutrientsDto(
    val carbohydrates: BigDecimal,
    val carbohydratesUnit: String,
    val energyKcal: BigDecimal,
    val fat: BigDecimal,
    val fatUnit: String,
    val fiber: BigDecimal,
    val fiberUnit: String,
    val proteins: BigDecimal,
    val proteinsUnit: String,
    val salt: BigDecimal,
    val saltUnit: String,
    val unSaturatedFat: BigDecimal,
    val unSaturatedFatUnit: String,
    val saturatedFat: BigDecimal,
    val saturatedFatUnit: String,
    val sodium: BigDecimal,
    val sodiumUnit: String,
    val sugars: BigDecimal,
    val sugarsUnit: String,
)
