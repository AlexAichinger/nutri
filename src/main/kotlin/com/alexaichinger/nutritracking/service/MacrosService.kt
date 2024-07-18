package com.alexaichinger.nutritracking.service

import com.alexaichinger.nutritracking.dto.internal.MacroNutrientsDto
import com.alexaichinger.nutritracking.dto.internal.MicroNutrientsDto
import com.alexaichinger.nutritracking.dto.internal.NutrientsDto
import com.alexaichinger.nutritracking.model.MealEntry
import com.alexaichinger.nutritracking.repository.MealEntryRepository
import com.alexaichinger.nutritracking.service.helpers.atEndOfDay
import com.alexaichinger.nutritracking.service.helpers.atStartOfDay
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
        val start = atStartOfDay(day)
        val end = atEndOfDay(day)

        val entries = repository.findByUserAndLoggingDateBetween(user, start, end)

        return getNutrientsDto(entries)
    }

    private fun getNutrientsDto(entries: List<MealEntry>): NutrientsDto {
        // macros
        var carbohydrates = BigDecimal.ZERO
        var carbohydratesUnit = "g"
        var energyKcal = BigDecimal.ZERO
        var fat = BigDecimal.ZERO
        var fatUnit = "g"
        var fiber = BigDecimal.ZERO
        var fiberUnit = "g"
        var proteins = BigDecimal.ZERO
        var proteinsUnit = "g"
        var salt = BigDecimal.ZERO
        var saltUnit = "g"
        var unSaturatedFat = BigDecimal.ZERO
        var unSaturatedFatUnit = "g"
        var saturatedFat = BigDecimal.ZERO
        var saturatedFatUnit = "g"
        var sodium = BigDecimal.ZERO
        var sodiumUnit = "g"
        var sugars = BigDecimal.ZERO
        var sugarsUnit = "g"

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
            carbohydrates = carbohydrates.plus(macros.carbohydrates)
            carbohydratesUnit = macros.carbohydratesUnit
            energyKcal = energyKcal.plus(macros.energyKcal)
            fat = fat.plus(macros.fat)
            fatUnit = macros.fatUnit
            fiber = fiber.plus(macros.fiber)
            fiberUnit = macros.fiberUnit
            proteins = proteins.plus(macros.proteins)
            proteinsUnit = macros.proteinsUnit
            salt = salt.plus(macros.salt)
            saltUnit = macros.saltUnit
            saturatedFat = saturatedFat.plus(macros.saturatedFat)
            saturatedFatUnit = macros.saturatedFatUnit
            sodium = sodium.plus(macros.sodium)
            sodiumUnit = macros.sodiumUnit
            sugars = sugars.plus(macros.sugars)
            sugarsUnit = macros.sugarsUnit

            val micros = it.foodInformation.microNutrients
            alcohol = alcohol.plus(micros.alcohol)
            betaCarotene = betaCarotene.plus(micros.betaCarotene)
            calcium = calcium.plus(micros.calcium)
            cholesterol = cholesterol.plus(micros.cholesterol)
            copper = copper.plus(micros.copper)
            fructose = fructose.plus(micros.fructose)
            galactose = galactose.plus(micros.galactose)
            glucose = glucose.plus(micros.glucose)
            iodine = iodine.plus(micros.iodine)
            iron = iron.plus(micros.iron)
            lactose = lactose.plus(micros.lactose)
            magnesium = magnesium.plus(micros.magnesium)
            maltose = maltose.plus(micros.maltose)
            manganese = manganese.plus(micros.manganese)
            pantothenicAcid = pantothenicAcid.plus(micros.pantothenicAcid)
            phosphorus = phosphorus.plus(micros.phosphorus)
            phylloquinone = phylloquinone.plus(micros.phylloquinone)
            polyols = polyols.plus(micros.polyols)
            potassium = potassium.plus(micros.potassium)
            selenium = selenium.plus(micros.selenium)
            starch = starch.plus(micros.starch)
            sucrose = sucrose.plus(micros.sucrose)
            vitaminA = vitaminA.plus(micros.vitaminA)
            vitaminB12 = vitaminB12.plus(micros.vitaminB12)
            vitaminB = vitaminB.plus(micros.vitaminB)
            vitaminB2 = vitaminB2.plus(micros.vitaminB2)
            vitaminB6 = vitaminB6.plus(micros.vitaminB6)
            vitaminB9 = vitaminB9.plus(micros.vitaminB9)
            vitaminC = vitaminC.plus(micros.vitaminC)
            vitaminD = vitaminD.plus(micros.vitaminD)
            vitaminE = vitaminE.plus(micros.vitaminE)
            vitaminPp = vitaminPp.plus(micros.vitaminPp)
            water = water.plus(micros.water)
            zinc = zinc.plus(micros.zinc)
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
