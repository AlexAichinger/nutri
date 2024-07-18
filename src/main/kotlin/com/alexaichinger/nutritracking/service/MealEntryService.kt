package com.alexaichinger.nutritracking.service

import com.alexaichinger.nutritracking.dto.external.client.ClientProductInfo
import com.alexaichinger.nutritracking.dto.internal.AutomaticTrackingMeal
import com.alexaichinger.nutritracking.dto.internal.ManualMealEntryDto
import com.alexaichinger.nutritracking.dto.internal.toEntity
import com.alexaichinger.nutritracking.exceptions.ProductNotFoundException
import com.alexaichinger.nutritracking.model.FoodInformation
import com.alexaichinger.nutritracking.model.MacroNutrients
import com.alexaichinger.nutritracking.model.MealEntry
import com.alexaichinger.nutritracking.model.MealType
import com.alexaichinger.nutritracking.model.MicroNutrients
import com.alexaichinger.nutritracking.repository.MealEntryRepository
import com.alexaichinger.nutritracking.service.helpers.atEndOfDay
import com.alexaichinger.nutritracking.service.helpers.atStartOfDay
import com.alexaichinger.nutritracking.service.openfoodfacts.OpenFoodFactsService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

@Service
class MealEntryService(
    private val mealEntryRepository: MealEntryRepository,
    private val openFoodFactsService: OpenFoodFactsService,
) {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    fun manualTrackMeal(entry: ManualMealEntryDto): MealEntry {
        log.info("Manually tracking food for user ${entry.user}")
        val entryToLog = entry.toEntity(entry.eatenInGrams)
        val savedEntry = mealEntryRepository.save(entryToLog)
        return savedEntry
    }

    fun automaticMealTracking(entry: AutomaticTrackingMeal): MealEntry {
        log.info("Automatic tracking food for user ${entry.user}")
        val barcode = entry.barcode
        val product = openFoodFactsService.getProductInfo(barcode)
            ?: throw ProductNotFoundException("Could not do automatic scanning as this product must be added first")
        val entryToLog = product.toMealEntry(entry.user, entry.mealType, entry.loggingDate, entry.eatenInGrams)
        val savedEntry = mealEntryRepository.save(entryToLog)
        return savedEntry
    }

    fun getMealsTracked(
        user: String,
        date: LocalDate,
    ): List<MealEntry> {
        val start = atStartOfDay(date)
        val end = atEndOfDay(date)
        return mealEntryRepository.findByUserAndLoggingDateBetween(user, start, end)
    }
}

fun ClientProductInfo.toMealEntry(
    user: String,
    mealType: MealType,
    entryDate: LocalDateTime,
    eatenInGrams: BigDecimal,
): MealEntry {
    val ratio = eatenInGrams.divide(BigDecimal.valueOf(100))
    return MealEntry(
        user = user,
        mealType = mealType,
        loggingDate = entryDate,
        foodInformation =
        FoodInformation(
            name = productNameEn,
            brand = brands,
            barcode = barcode,
            macroNutrients =
            MacroNutrients(
                eatenGrams = eatenInGrams,
                carbohydrates = nutrients.macros.carbohydrates100g.multiply(ratio),
                carbohydratesUnit = nutrients.macros.carbohydratesUnit,
                energyKcal = nutrients.macros.energyKcal100g.multiply(ratio),
                fat = nutrients.macros.fat100g.multiply(ratio),
                fatUnit = nutrients.macros.fatUnit,
                fiber = nutrients.macros.fiber100g.multiply(ratio),
                fiberUnit = nutrients.macros.fiberUnit,
                fruitsVegetablesLegumesEstimateFromIngredients100g = nutrients.macros.fruitsVegetablesLegumesEstimateFromIngredients100g,
                fruitsVegetablesLegumesEstimateFromIngredientsServing =
                nutrients.macros.fruitsVegetablesNutsEstimateFromIngredients100g.multiply(
                    ratio,
                ),
                fruitsVegetablesNutsEstimateFromIngredients100g = nutrients.macros.fruitsVegetablesNutsEstimateFromIngredients100g,
                fruitsVegetablesNutsEstimateFromIngredientsServing =
                nutrients.macros.fruitsVegetablesNutsEstimateFromIngredients100g.multiply(
                    ratio,
                ),
                proteins = nutrients.macros.proteins100g.multiply(ratio),
                proteinsUnit = nutrients.macros.proteinsUnit,
                salt = nutrients.macros.salt100g.multiply(ratio),
                saltUnit = nutrients.macros.saltUnit,
                saturatedFat = nutrients.macros.saturatedFat100g.multiply(ratio),
                saturatedFatUnit = nutrients.macros.saturatedFatUnit,
                sodium = nutrients.macros.sodium100g.multiply(ratio),
                sodiumUnit = nutrients.macros.sodiumUnit,
                sugars = nutrients.macros.sugars100g.multiply(ratio),
                sugarsUnit = nutrients.macros.sugarsUnit,
            ),
            microNutrients =
            MicroNutrients(
                alcohol = nutrients.micros.alcohol100g.multiply(ratio),
                betaCarotene = nutrients.micros.betaCarotene100g.multiply(ratio),
                caffeine = BigDecimal.ZERO,
                calcium = nutrients.micros.calcium100g.multiply(ratio),
                cholesterol = nutrients.micros.cholesterol100g.multiply(ratio),
                copper = nutrients.micros.copper100g.multiply(ratio),
                fructose = nutrients.micros.fructose100g.multiply(ratio),
                galactose = nutrients.micros.galactose100g.multiply(ratio),
                glucose = nutrients.micros.glucose100g.multiply(ratio),
                iodine = nutrients.micros.iodine100g.multiply(ratio),
                iron = nutrients.micros.iron100g.multiply(ratio),
                lactose = nutrients.micros.lactose100g.multiply(ratio),
                magnesium = nutrients.micros.magnesium100g.multiply(ratio),
                maltose = nutrients.micros.maltose100g.multiply(ratio),
                manganese = nutrients.micros.manganese100g.multiply(ratio),
                pantothenicAcid = nutrients.micros.pantothenicAcid100g.multiply(ratio),
                phosphorus = nutrients.micros.phosphorus100g.multiply(ratio),
                phylloquinone = nutrients.micros.phylloquinone100g.multiply(ratio),
                polyols = nutrients.micros.polyols100g.multiply(ratio),
                potassium = nutrients.micros.potassium100g.multiply(ratio),
                selenium = nutrients.micros.selenium100g.multiply(ratio),
                starch = nutrients.micros.starch100g.multiply(ratio),
                sucrose = nutrients.micros.sucrose100g.multiply(ratio),
                vitaminA = nutrients.micros.vitaminA100g.multiply(ratio),
                vitaminB12 = nutrients.micros.vitaminB12100g.multiply(ratio),
                vitaminB = nutrients.micros.vitaminB100g.multiply(ratio),
                vitaminB2 = nutrients.micros.vitaminB2100g.multiply(ratio),
                vitaminB6 = nutrients.micros.vitaminB6100g.multiply(ratio),
                vitaminB9 = nutrients.micros.vitaminB9100g.multiply(ratio),
                vitaminC = nutrients.micros.vitaminC100g.multiply(ratio),
                vitaminD = nutrients.micros.vitaminD100g.multiply(ratio),
                vitaminE = nutrients.micros.vitaminE100g.multiply(ratio),
                vitaminPp = nutrients.micros.vitaminPp100g.multiply(ratio),
                water = nutrients.micros.water100g.multiply(ratio),
                zinc = nutrients.micros.zinc100g.multiply(ratio),
            ),
        ),
    )
}
