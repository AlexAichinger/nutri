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
        val product =
            openFoodFactsService.getProductInfo(barcode)
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
        return mealEntryRepository.findByUserAndLoggingDateBetween(user, start, end).map { it }
    }
}

fun ClientProductInfo.toMealEntry(
    user: String,
    mealType: MealType,
    entryDate: LocalDateTime,
    eatenInGrams: BigDecimal,
): MealEntry {
    val ratio = eatenInGrams.divide(BigDecimal.valueOf(100))
    val macros = nutrients.macros
    val micros = nutrients.micros
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
                        carbohydrates = macros.carbohydrates100g?.multiply(ratio),
                        carbohydratesUnit = macros.carbohydratesUnit,
                        energyKcal = macros.energyKcal100g?.multiply(ratio),
                        fat = macros.fat100g?.multiply(ratio),
                        fatUnit = macros.fatUnit,
                        fiber = macros.fiber100g?.multiply(ratio),
                        fiberUnit = macros.fiberUnit,
                        fruitsVegetablesLegumesEstimateFromIngredients100g = macros.fruitsVegetablesLegumesEstimateFromIngredients100g,
                        fruitsVegetablesLegumesEstimateFromIngredientsServing =
                            macros.fruitsVegetablesNutsEstimateFromIngredients100g?.multiply(
                                ratio,
                            ),
                        fruitsVegetablesNutsEstimateFromIngredients100g = macros.fruitsVegetablesNutsEstimateFromIngredients100g,
                        fruitsVegetablesNutsEstimateFromIngredientsServing =
                            macros.fruitsVegetablesNutsEstimateFromIngredients100g?.multiply(
                                ratio,
                            ),
                        proteins = macros.proteins100g?.multiply(ratio),
                        proteinsUnit = macros.proteinsUnit,
                        salt = macros.salt100g?.multiply(ratio),
                        saltUnit = macros.saltUnit,
                        saturatedFat = macros.saturatedFat100g?.multiply(ratio),
                        saturatedFatUnit = macros.saturatedFatUnit,
                        sodium = macros.sodium100g?.multiply(ratio),
                        sodiumUnit = macros.sodiumUnit,
                        sugars = macros.sugars100g?.multiply(ratio),
                        sugarsUnit = macros.sugarsUnit,
                    ),
                microNutrients =
                    MicroNutrients(
                        alcohol = micros.alcohol100g?.multiply(ratio),
                        betaCarotene = micros.betaCarotene100g?.multiply(ratio),
                        caffeine = null,
                        calcium = micros.calcium100g?.multiply(ratio),
                        cholesterol = micros.cholesterol100g?.multiply(ratio),
                        copper = micros.copper100g?.multiply(ratio),
                        fructose = micros.fructose100g?.multiply(ratio),
                        galactose = micros.galactose100g?.multiply(ratio),
                        glucose = micros.glucose100g?.multiply(ratio),
                        iodine = micros.iodine100g?.multiply(ratio),
                        iron = micros.iron100g?.multiply(ratio),
                        lactose = micros.lactose100g?.multiply(ratio),
                        magnesium = micros.magnesium100g?.multiply(ratio),
                        maltose = micros.maltose100g?.multiply(ratio),
                        manganese = micros.manganese100g?.multiply(ratio),
                        pantothenicAcid = micros.pantothenicAcid100g?.multiply(ratio),
                        phosphorus = micros.phosphorus100g?.multiply(ratio),
                        phylloquinone = micros.phylloquinone100g?.multiply(ratio),
                        polyols = micros.polyols100g?.multiply(ratio),
                        potassium = micros.potassium100g?.multiply(ratio),
                        selenium = micros.selenium100g?.multiply(ratio),
                        starch = micros.starch100g?.multiply(ratio),
                        sucrose = micros.sucrose100g?.multiply(ratio),
                        vitaminA = micros.vitaminA100g?.multiply(ratio),
                        vitaminB12 = micros.vitaminB12100g?.multiply(ratio),
                        vitaminB = micros.vitaminB100g?.multiply(ratio),
                        vitaminB2 = micros.vitaminB2100g?.multiply(ratio),
                        vitaminB6 = micros.vitaminB6100g?.multiply(ratio),
                        vitaminB9 = micros.vitaminB9100g?.multiply(ratio),
                        vitaminC = micros.vitaminC100g?.multiply(ratio),
                        vitaminD = micros.vitaminD100g?.multiply(ratio),
                        vitaminE = micros.vitaminE100g?.multiply(ratio),
                        vitaminPp = micros.vitaminPp100g?.multiply(ratio),
                        water = micros.water100g?.multiply(ratio),
                        zinc = micros.zinc100g?.multiply(ratio),
                    ),
            ),
    )
}
