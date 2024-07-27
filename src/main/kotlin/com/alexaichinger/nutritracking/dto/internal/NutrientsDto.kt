package com.alexaichinger.nutritracking.dto.internal

import com.alexaichinger.nutritracking.model.nutrition.MealEntry
import java.math.BigDecimal

data class NutrientsDto(
    var macroNutrients: MacroNutrientsDto,
    var microNutrients: MicroNutrientsDto,
)

fun List<MealEntry>.toDto(): NutrientsDto {
    // macros total
    var carbohydrates = BigDecimal.ZERO
    var carbohydratesUnit: String? = null
    var energyKcal = BigDecimal.ZERO
    var fat = BigDecimal.ZERO
    var fatUnit: String? = null
    var fiber = BigDecimal.ZERO
    var fiberUnit: String? = null
    var proteins = BigDecimal.ZERO
    var proteinsUnit: String? = null
    var salt = BigDecimal.ZERO
    var saltUnit: String? = null
    var saturatedFat = BigDecimal.ZERO
    var saturatedFatUnit: String? = null
    var sodium = BigDecimal.ZERO
    var sodiumUnit: String? = null
    var sugars = BigDecimal.ZERO
    var sugarsUnit: String? = null

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

        macros.carbohydrates?.let { carbohydrates += macros.carbohydrates }
        macros.carbohydratesUnit?.let { carbohydratesUnit = macros.carbohydratesUnit }
        macros.energyKcal?.let { energyKcal += macros.energyKcal }
        macros.fat?.let { fat += macros.fat }
        macros.fatUnit?.let { fatUnit = macros.fatUnit }
        macros.fiber?.let { fiber += macros.fiber }
        macros.fiberUnit?.let { fiberUnit = macros.fiberUnit }
        macros.proteins?.let { proteins += macros.proteins }
        macros.proteinsUnit?.let { proteinsUnit = macros.proteinsUnit }
        macros.salt?.let { salt += macros.salt }
        macros.saltUnit?.let { saltUnit = macros.saltUnit }
        macros.saturatedFat?.let { saturatedFat += macros.saturatedFat }
        macros.saturatedFatUnit?.let { saturatedFatUnit = macros.saturatedFatUnit }
        macros.sodium?.let { sodium += macros.sodium }
        macros.sodiumUnit?.let { sodiumUnit = macros.sodiumUnit }
        macros.sugars?.let { sugars += macros.sugars }
        macros.sugarsUnit?.let { sugarsUnit = macros.sugarsUnit }

        micros.alcohol?.let { alcohol += micros.alcohol }
        micros.betaCarotene?.let { betaCarotene += micros.betaCarotene }
        micros.caffeine?.let { caffeine += micros.caffeine }
        micros.calcium?.let { calcium += micros.calcium }
        micros.cholesterol?.let { cholesterol += micros.cholesterol }
        micros.copper?.let { copper += micros.copper }
        micros.fructose?.let { fructose += micros.fructose }
        micros.galactose?.let { galactose += micros.galactose }
        micros.glucose?.let { glucose += micros.glucose }
        micros.iodine?.let { iodine += micros.iodine }
        micros.iron?.let { iron += micros.iron }
        micros.lactose?.let { lactose += micros.lactose }
        micros.magnesium?.let { magnesium += micros.magnesium }
        micros.maltose?.let { maltose += micros.maltose }
        micros.manganese?.let { manganese += micros.manganese }
        micros.pantothenicAcid?.let { pantothenicAcid += micros.pantothenicAcid }
        micros.phosphorus?.let { phosphorus += micros.phosphorus }
        micros.phylloquinone?.let { phylloquinone += micros.phylloquinone }
        micros.polyols?.let { polyols += micros.polyols }
        micros.potassium?.let { potassium += micros.potassium }
        micros.selenium?.let { selenium += micros.selenium }
        micros.starch?.let { starch += micros.starch }
        micros.sucrose?.let { sucrose += micros.sucrose }
        micros.vitaminA?.let { vitaminA += micros.vitaminA }
        micros.vitaminB12?.let { vitaminB12 += micros.vitaminB12 }
        micros.vitaminB?.let { vitaminB += micros.vitaminB }
        micros.vitaminB2?.let { vitaminB2 += micros.vitaminB2 }
        micros.vitaminB6?.let { vitaminB6 += micros.vitaminB6 }
        micros.vitaminB9?.let { vitaminB9 += micros.vitaminB9 }
        micros.vitaminC?.let { vitaminC += micros.vitaminC }
        micros.vitaminD?.let { vitaminD += micros.vitaminD }
        micros.vitaminE?.let { vitaminE += micros.vitaminE }
        micros.vitaminPp?.let { vitaminPp += micros.vitaminPp }
        micros.water?.let { water += micros.water }
        micros.zinc?.let { zinc += micros.zinc }
    }

    return NutrientsDto(
        macroNutrients =
            MacroNutrientsDto(
                carbohydrates,
                carbohydratesUnit,
                energyKcal,
                fat,
                fatUnit,
                fiber,
                fiberUnit,
                proteins,
                proteinsUnit,
                salt,
                saltUnit,
                saturatedFat,
                saturatedFatUnit,
                sodium,
                sodiumUnit,
                sugars,
                sugarsUnit,
            ),
        microNutrients =
            MicroNutrientsDto(
                alcohol,
                betaCarotene,
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
                caffeine,
            ),
    )
}
