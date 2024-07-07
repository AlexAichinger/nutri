package com.alexaichinger.nutri_tracking.dto

import java.math.BigDecimal

data class MacrosDto(
    var calories: BigDecimal,
    var protein: BigDecimal? = null,
    var fat: BigDecimal? = null,
    var carbs: BigDecimal? = null,
    var fiber: BigDecimal? = null,
    var addedSugar: BigDecimal? = null,
    var naturalSugar: BigDecimal? = null,
    var saturatedFat: BigDecimal? = null,
    val unsaturatedFat: BigDecimal? = null,
    var sodium: BigDecimal? = null,
    var cholestral: BigDecimal? = null,
    var potassium: BigDecimal? = null,
)
