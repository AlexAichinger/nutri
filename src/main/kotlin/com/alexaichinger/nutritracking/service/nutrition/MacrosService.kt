package com.alexaichinger.nutritracking.service.nutrition

import com.alexaichinger.nutritracking.dto.internal.MacroNutrientsDto
import com.alexaichinger.nutritracking.dto.internal.MicroNutrientsDto
import com.alexaichinger.nutritracking.dto.internal.NutrientsDto
import com.alexaichinger.nutritracking.model.nutrition.MealEntry
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
            macros.carbohydrates?.let { carbohydrates = carbohydrates.plus(macros.carbohydrates) }
            macros.carbohydratesUnit?.let { carbohydratesUnit = macros.carbohydratesUnit }
            macros.energyKcal?.let { energyKcal = energyKcal.plus(macros.energyKcal) }
            macros.fat?.let { fat = fat.plus(macros.fat) }
            macros.fatUnit?.let { fatUnit = macros.fatUnit }
            macros.fiber?.let { fiber = fiber.plus(macros.fiber) }
            macros.fiberUnit?.let { fiberUnit = macros.fiberUnit }
            macros.proteins?.let { proteins = proteins.plus(macros.proteins) }
            macros.proteinsUnit?.let { proteinsUnit = macros.proteinsUnit }
            macros.salt?.let { salt = salt.plus(macros.salt) }
            macros.saltUnit?.let { saltUnit = macros.saltUnit }
            macros.saturatedFat?.let { saturatedFat = saturatedFat.plus(macros.saturatedFat) }
            macros.saturatedFatUnit?.let { saturatedFatUnit = macros.saturatedFatUnit }
            macros.sodium?.let { sodium = sodium.plus(macros.sodium) }
            macros.sodiumUnit?.let { sodiumUnit = macros.sodiumUnit }
            macros.sugars?.let { sugars = sugars.plus(macros.sugars) }
            macros.sugarsUnit?.let { sugarsUnit = macros.sugarsUnit }

            val micros = it.foodInformation.microNutrients
            micros.alcohol?.let { alcohol = alcohol.plus(micros.alcohol) }
            micros.betaCarotene?.let { betaCarotene = betaCarotene.plus(micros.betaCarotene) }
            micros.calcium?.let { calcium = calcium.plus(micros.calcium) }
            micros.cholesterol?.let { cholesterol = cholesterol.plus(micros.cholesterol) }
            micros.copper?.let { copper = copper.plus(micros.copper) }
            micros.fructose?.let { fructose = fructose.plus(micros.fructose) }
            micros.galactose?.let { galactose = galactose.plus(micros.galactose) }
            micros.glucose?.let { glucose = glucose.plus(micros.glucose) }
            micros.iodine?.let { iodine = iodine.plus(micros.iodine) }
            micros.iron?.let { iron = iron.plus(micros.iron) }
            micros.lactose?.let { lactose = lactose.plus(micros.lactose) }
            micros.magnesium?.let { magnesium = magnesium.plus(micros.magnesium) }
            micros.maltose?.let { maltose = maltose.plus(micros.maltose) }
            micros.manganese?.let { manganese = manganese.plus(micros.manganese) }
            micros.pantothenicAcid?.let { pantothenicAcid = pantothenicAcid.plus(micros.pantothenicAcid) }
            micros.phosphorus?.let { phosphorus = phosphorus.plus(micros.phosphorus) }
            micros.phylloquinone?.let { phylloquinone = phylloquinone.plus(micros.phylloquinone) }
            micros.polyols?.let { polyols = polyols.plus(micros.polyols) }
            micros.potassium?.let { potassium = potassium.plus(micros.potassium) }
            micros.selenium?.let { selenium = selenium.plus(micros.selenium) }
            micros.starch?.let { starch = starch.plus(micros.starch) }
            micros.sucrose?.let { sucrose = sucrose.plus(micros.sucrose) }
            micros.vitaminA?.let { vitaminA = vitaminA.plus(micros.vitaminA) }
            micros.vitaminB12?.let { vitaminB12 = vitaminB12.plus(micros.vitaminB12) }
            micros.vitaminB?.let { vitaminB = vitaminB.plus(micros.vitaminB) }
            micros.vitaminB2?.let { vitaminB2 = vitaminB2.plus(micros.vitaminB2) }
            micros.vitaminB6?.let { vitaminB6 = vitaminB6.plus(micros.vitaminB6) }
            micros.vitaminB9?.let { vitaminB9 = vitaminB9.plus(micros.vitaminB9) }
            micros.vitaminC?.let { vitaminC = vitaminC.plus(micros.vitaminC) }
            micros.vitaminD?.let { vitaminD = vitaminD.plus(micros.vitaminD) }
            micros.vitaminE?.let { vitaminE = vitaminE.plus(micros.vitaminE) }
            micros.vitaminPp?.let { vitaminPp = vitaminPp.plus(micros.vitaminPp) }
            micros.water?.let { water = water.plus(micros.water) }
            micros.zinc?.let { zinc = zinc.plus(micros.zinc) }
            micros.caffeine?.let { caffeine += micros.caffeine }
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
}
