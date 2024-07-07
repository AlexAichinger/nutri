package com.alexaichinger.nutri_tracking.model

import java.math.BigDecimal

data class NutritionInformation(
    var calories: BigDecimal,
    var servingSize: BigDecimal? = null,
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
