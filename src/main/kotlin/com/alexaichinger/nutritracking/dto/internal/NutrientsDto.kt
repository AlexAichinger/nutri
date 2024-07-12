package com.alexaichinger.nutritracking.dto.internal

import com.alexaichinger.nutritracking.model.MealEntry
import java.math.BigDecimal
import com.alexaichinger.nutritracking.service.helpers.plus

data class NutrientsDto(
    var macroNutrients: MacroNutrientsDto,
    var microNutrients: MicroNutrientsDto,
)

fun List<MealEntry>.toDto(): NutrientsDto {
    // macros total
    var carbohydrates = BigDecimal.ZERO
    var energyKcal = BigDecimal.ZERO
    var fat = BigDecimal.ZERO
    var fiber = BigDecimal.ZERO
    var proteins = BigDecimal.ZERO
    var salt = BigDecimal.ZERO
    var saturatedFat = BigDecimal.ZERO
    var unSaturatedFat = BigDecimal.ZERO
    var sodium = BigDecimal.ZERO
    var sugars = BigDecimal.ZERO

    // micros total
    var alcohol = BigDecimal.ZERO
    var betaCarotene = BigDecimal.ZERO
    var caffeine = BigDecimal.ZERO
    var calcium = BigDecimal.ZERO
    var cholesterol = BigDecimal.ZERO
    var copper = BigDecimal.ZERO
    var fructose = BigDecimal.ZERO
    var galactose = BigDecimal.ZERO
    var glucose = BigDecimal.ZERO
    var iodine = BigDecimal.ZERO
    var iron = BigDecimal.ZERO
    var lactose = BigDecimal.ZERO
    var magnesium = BigDecimal.ZERO
    var maltose = BigDecimal.ZERO
    var manganese = BigDecimal.ZERO
    var pantothenicAcid = BigDecimal.ZERO
    var phosphorus = BigDecimal.ZERO
    var phylloquinone = BigDecimal.ZERO
    var polyols = BigDecimal.ZERO
    var potassium = BigDecimal.ZERO
    var selenium = BigDecimal.ZERO
    var starch = BigDecimal.ZERO
    var sucrose = BigDecimal.ZERO
    var vitaminA = BigDecimal.ZERO
    var vitaminB12 = BigDecimal.ZERO
    var vitaminB = BigDecimal.ZERO
    var vitaminB2 = BigDecimal.ZERO
    var vitaminB6 = BigDecimal.ZERO
    var vitaminB9 = BigDecimal.ZERO
    var vitaminC = BigDecimal.ZERO
    var vitaminD = BigDecimal.ZERO
    var vitaminE = BigDecimal.ZERO
    var vitaminPp = BigDecimal.ZERO
    var water = BigDecimal.ZERO
    var zinc = BigDecimal.ZERO
    
    this.forEach { entry ->
        val macros = entry.foodInformation.macroNutrients
        val micros = entry.foodInformation.microNutrients

        carbohydrates += macros.carbohydrates
        energyKcal += macros.energyKcal
        fat += macros.fat
        fiber += macros.fiber
        proteins += macros.proteins
        salt += macros.salt
        saturatedFat += macros.saturatedFat
        unSaturatedFat += macros.fat - macros.saturatedFat
        sodium += macros.sodium
        sugars += macros.sugars

        alcohol += micros.alcohol
        alcohol += micros.alcohol
        alcohol += micros.alcohol
    }
    
    return NutrientsDto(
        macroNutrients = MacroNutrientsDto(
            
        ),
        microNutrients = MicroNutrientsDto(),
    )
}