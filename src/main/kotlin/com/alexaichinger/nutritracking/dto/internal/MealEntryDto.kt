package com.alexaichinger.nutritracking.dto.internal

import com.alexaichinger.nutritracking.model.FoodInformation
import com.alexaichinger.nutritracking.model.MealEntry
import com.alexaichinger.nutritracking.model.MealTime
import com.alexaichinger.nutritracking.model.NutritionInformation
import com.fasterxml.jackson.annotation.JsonFormat
import java.math.BigDecimal
import java.time.LocalDate

data class MealEntryDto(
    val user: String,
    val mealTime: MealTime,
    @JsonFormat(pattern = "dd/MM/yyyy")
    val loggingDate: LocalDate,
    val foodInformation: FoodInformationDto,
)

data class NutritionInformationDto(
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

data class FoodInformationDto(
    var name: String,
    var barcode: String,
    var nutritionInformation: NutritionInformationDto,
)

fun MealEntryDto.toEntity(): MealEntry {
    return MealEntry(
        user = user,
        mealTime = mealTime,
        loggingDate = loggingDate,
        foodInformation = foodInformation.toEntity(),
    )
}

fun FoodInformationDto.toEntity(): FoodInformation {
    return FoodInformation(
        name = name,
        barcode = barcode,
        nutritionInformation = nutritionInformation.toEntity(),
    )
}

fun NutritionInformationDto.toEntity(): NutritionInformation {
    return NutritionInformation(
        calories = calories,
        servingSize = servingSize,
        protein = protein,
        fat = fat,
        carbs = carbs,
        fiber = fiber,
        addedSugar = addedSugar,
        naturalSugar = naturalSugar,
        saturatedFat = saturatedFat,
        unsaturatedFat = unsaturatedFat,
        sodium = sodium,
        cholestral = cholestral,
        potassium = potassium,
    )
}