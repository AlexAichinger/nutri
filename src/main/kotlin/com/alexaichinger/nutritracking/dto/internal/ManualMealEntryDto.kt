package com.alexaichinger.nutritracking.dto.internal

import com.alexaichinger.nutritracking.model.FoodInformation
import com.alexaichinger.nutritracking.model.MacroNutrients
import com.alexaichinger.nutritracking.model.MealEntry
import com.alexaichinger.nutritracking.model.MealType
import com.alexaichinger.nutritracking.model.MicroNutrients
import com.fasterxml.jackson.annotation.JsonFormat
import java.math.BigDecimal
import java.time.LocalDateTime

data class ManualMealEntryDto(
    val user: String,
    val mealType: MealType,
    val eatenInGrams: BigDecimal,
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ")
    val loggingDate: LocalDateTime,
    val manualFoodInformation: ManualFoodInformationDto,
)

data class ManualFoodInformationDto(
    var name: String,
    var macroNutrients: MacroNutrientsDto,
    var microNutrients: MicroNutrientsDto? = MicroNutrientsDto(),
)

fun ManualMealEntryDto.toEntity(eatenInGrams: BigDecimal): MealEntry {
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
        barcode = null,
        macroNutrients = macroNutrients.toEntity(eatenInGrams),
        microNutrients = MicroNutrients(),
    )
}

fun MacroNutrientsDto.toEntity(eatenInGrams: BigDecimal): MacroNutrients {
    return MacroNutrients(
        energyKcal = energyKcal,
        eatenGrams = eatenInGrams,
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

fun MicroNutrientsDto.toEntity(): MicroNutrients {
    return MicroNutrients(
        alcohol,
        betaCarotene,
        caffeine,
        calcium,
        cholesterol,
        copper,
        fructose,
        galactose,
        glucose,
        iodine,
        iron,
        lactose,
        magnesium,
        maltose,
        manganese,
        pantothenicAcid,
        phosphorus,
        phylloquinone,
        polyols,
        potassium,
        selenium,
        starch,
        sucrose,
        vitaminA,
        vitaminB12,
        vitaminB,
        vitaminB2,
        vitaminB6,
        vitaminB9,
        vitaminC,
        vitaminD,
        vitaminE,
        vitaminPp,
        water,
        zinc,
    )
}
