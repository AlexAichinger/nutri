package com.alexaichinger.nutritracking.dto.internal

import java.math.BigDecimal

data class MacroNutrientsDto(
    val carbohydrates: BigDecimal? = null,
    val carbohydratesUnit: String? = null,
    val energyKcal: BigDecimal? = null,
    val fat: BigDecimal? = null,
    val fatUnit: String? = null,
    val fiber: BigDecimal? = null,
    val fiberUnit: String? = null,
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
