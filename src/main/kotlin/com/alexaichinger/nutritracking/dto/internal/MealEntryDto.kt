package com.alexaichinger.nutritracking.dto.internal

import com.alexaichinger.nutritracking.dto.external.client.ClientMicroNutrients
import com.alexaichinger.nutritracking.model.FoodInformation
import com.alexaichinger.nutritracking.model.MealEntry
import com.alexaichinger.nutritracking.model.MealType
import com.alexaichinger.nutritracking.model.MacroNutrients
import com.fasterxml.jackson.annotation.JsonFormat
import java.math.BigDecimal
import java.time.LocalDate

data class MealEntryDto(
    val user: String,
    val mealType: MealType,
    val eatenInGrams: BigDecimal,
    @JsonFormat(pattern = "dd/MM/yyyy")
    val loggingDate: LocalDate,
    val manualFoodInformation: ManualFoodInformationDto,
    val openFoodFactsProductTracking: OpenFoodFactsProductTracking? = null,
)

data class OpenFoodFactsProductTracking(
    val barcode: String,
)

data class ManualFoodInformationDto(
    var name: String,
    var barcode: String,
    var macroNutrients: MacroNutrientsDto,
    var microNutrients: MicroNutrientsDto? = null
)

fun MealEntryDto.toEntity(eatenInGrams: BigDecimal): MealEntry {
    return MealEntry(
        user = user,
        mealType = mealType,
        loggingDate = loggingDate,
        foodInformation = manualFoodInformation.toEntity(eatenInGrams),
    )
}

fun ManualFoodInformationDto.toEntity(eatenInGrams: BigDecimal): FoodInformation {
    return FoodInformation(
        name = name,
        brand = null,
        barcode = barcode,
        macroNutrients = macroNutrients.toEntity(eatenInGrams),
        microNutrients = ClientMicroNutrients()
    )
}

fun MacroNutrientsDto.toEntity(eatenInGrams: BigDecimal): MacroNutrients {
    return MacroNutrients(
        energyKcal = energyKcal,
        servingSizeG = eatenInGrams,
        carbohydrates = carbohydrates,
        carbohydratesUnit = carbohydratesUnit,
        fat = fat,
        fatUnit = fatUnit,
        fiber = fiber,
        fiberUnit = fiberUnit,
        proteins = proteins,
        proteinsUnit = proteinsUnit,
        salt = salt,
        saltUnit = saltUnit,
        saturatedFat = saturatedFat,
        saturatedFatUnit = saturatedFatUnit,
        sodium = sodium,
        sodiumUnit = sodiumUnit,
        sugars = sugars,
        sugarsUnit = sugarsUnit,
        fruitsVegetablesLegumesEstimateFromIngredientsServing = BigDecimal.ZERO,
        fruitsVegetablesNutsEstimateFromIngredientsServing = BigDecimal.ZERO,
        fruitsVegetablesLegumesEstimateFromIngredients100g = BigDecimal.ZERO,
        fruitsVegetablesNutsEstimateFromIngredients100g = BigDecimal.ZERO,
    )
}
