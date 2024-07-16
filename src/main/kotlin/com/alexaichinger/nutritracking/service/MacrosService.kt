package com.alexaichinger.nutritracking.service

import com.alexaichinger.nutritracking.dto.internal.MacroNutrientsDto
import com.alexaichinger.nutritracking.dto.internal.MicroNutrientsDto
import com.alexaichinger.nutritracking.dto.internal.NutrientsDto
import com.alexaichinger.nutritracking.model.MealEntry
import com.alexaichinger.nutritracking.repository.MealEntryRepository
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.time.LocalDate

@Service
class MacrosService(
    private val repository: MealEntryRepository,
) {
    fun getTotalUserNutrients(
        user: String,
        day: LocalDate,
    ): NutrientsDto {
        val entries = repository.findByUserAndLoggingDate(user, day)

        return getNutrientsDto(entries)
    }

    private fun getNutrientsDto(entries: List<MealEntry>): NutrientsDto {
        // macros
        var carbohydrates = BigDecimal.ZERO
        var carbohydratesUnit = "undefined"
        var energyKcal = BigDecimal.ZERO
        var fat = BigDecimal.ZERO
        var fatUnit = "undefined"
        var fiber = BigDecimal.ZERO
        var fiberUnit = "undefined"
        var proteins = BigDecimal.ZERO
        var proteinsUnit = "undefined"
        var salt = BigDecimal.ZERO
        var saltUnit = "undefined"
        var unSaturatedFat = BigDecimal.ZERO
        var unSaturatedFatUnit = "undefined"
        var saturatedFat = BigDecimal.ZERO
        var saturatedFatUnit = "undefined"
        var sodium = BigDecimal.ZERO
        var sodiumUnit = "undefined"
        var sugars = BigDecimal.ZERO
        var sugarsUnit = "undefined"

        // micros
        var alcohol = BigDecimal.ZERO
        var betaCarotene = BigDecimal.ZERO
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
        var caffeine = BigDecimal.ZERO

        entries.forEach {
            val macros = it.foodInformation.macroNutrients
            carbohydrates += macros.carbohydrates
            carbohydratesUnit = macros.carbohydratesUnit
            energyKcal += macros.energyKcal
            fat += macros.fat
            fatUnit = macros.fatUnit
            fiber += macros.fiber
            fiberUnit = macros.fiberUnit
            proteins += macros.proteins
            proteinsUnit = macros.proteinsUnit
            salt += macros.salt
            saltUnit = macros.saltUnit
            saturatedFat += macros.saturatedFat
            saturatedFatUnit = macros.saturatedFatUnit
            sodium += macros.sodium
            sodiumUnit = macros.sodiumUnit
            sugars += macros.sugars
            sugarsUnit = macros.sugarsUnit

            val micros = it.foodInformation.microNutrients
            alcohol += micros.alcohol
            betaCarotene += micros.betaCarotene
            calcium += micros.calcium
            cholesterol += micros.cholesterol
            copper += micros.copper
            fructose += micros.fructose
            galactose += micros.galactose
            glucose += micros.glucose
            iodine += micros.iodine
            iron += micros.iron
            lactose += micros.lactose
            magnesium += micros.magnesium
            maltose += micros.maltose
            manganese += micros.manganese
            pantothenicAcid += micros.pantothenicAcid
            phosphorus += micros.phosphorus
            phylloquinone += micros.phylloquinone
            polyols += micros.polyols
            potassium += micros.potassium
            selenium += micros.selenium
            starch += micros.starch
            sucrose += micros.sucrose
            vitaminA += micros.vitaminA
            vitaminB12 += micros.vitaminB12
            vitaminB += micros.vitaminB
            vitaminB2 += micros.vitaminB2
            vitaminB6 += micros.vitaminB6
            vitaminB9 += micros.vitaminB9
            vitaminC += micros.vitaminC
            vitaminD += micros.vitaminD
            vitaminE += micros.vitaminE
            vitaminPp += micros.vitaminPp
            water += micros.water
            zinc += micros.zinc
            caffeine += micros.caffeine
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
                    unSaturatedFat,
                    unSaturatedFatUnit,
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
}
