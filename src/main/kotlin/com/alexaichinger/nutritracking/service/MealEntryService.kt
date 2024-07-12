package com.alexaichinger.nutritracking.service

import com.alexaichinger.nutritracking.dto.external.client.ClientProductInfo
import com.alexaichinger.nutritracking.dto.internal.MealEntryDto
import com.alexaichinger.nutritracking.dto.internal.toEntity
import com.alexaichinger.nutritracking.model.FoodInformation
import com.alexaichinger.nutritracking.model.MealEntry
import com.alexaichinger.nutritracking.model.MacroNutrients
import com.alexaichinger.nutritracking.repository.MealEntryRepository
import com.alexaichinger.nutritracking.service.openfoodfacts.OpenFoodFactsService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.time.LocalDate

@Service
open class MealEntryService(
    private val mealEntryRepository: MealEntryRepository,
    private val openFoodFactsService: OpenFoodFactsService,
) {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    fun logMeal(entry: MealEntryDto): MealEntry {
        return if (entry.openFoodFactsProductTracking != null) {
            automaticLogging(entry)
            manualLogging(entry)
        } else {
            manualLogging(entry)
        }
    }

    fun getMealsTracked(
        user: String,
        date: LocalDate,
    ): List<MealEntry> {
        return mealEntryRepository.findByUserAndLoggingDate(user, date)
    }

    private fun manualLogging(entry: MealEntryDto): MealEntry {
        val entryToLog = entry.toEntity(entry.eatenInGrams)
        val savedEntry = mealEntryRepository.save(entryToLog) // TODO: Handle differently
        return savedEntry
    }

    private fun automaticLogging(entry: MealEntryDto): MealEntry {
        val barcode = entry.openFoodFactsProductTracking!!.barcode
        val product = openFoodFactsService.getProductInfo(barcode) ?: throw NotFoundException() // TODO: cleanup
        val productToLog = product.toMealEntry(entry)
        val savedEntry = mealEntryRepository.save(productToLog)
        return savedEntry
    }
}

fun ClientProductInfo.toMealEntry(mealEntryDto: MealEntryDto): MealEntry {
    val ratio = mealEntryDto.openFoodFactsProductTracking!!.eatenInGrams.divide(BigDecimal.valueOf(100))
    return MealEntry(
        user = mealEntryDto.user,
        mealType = mealEntryDto.mealType,
        loggingDate = mealEntryDto.loggingDate,
        foodInformation =
            FoodInformation(
                name = genericName,
                barcode = mealEntryDto.openFoodFactsProductTracking.barcode,
                macroNutrients =
                    MacroNutrients(
                        calories = nutrients.macros.energyKcal100g.multiply(ratio),
                        servingSize = mealEntryDto.openFoodFactsProductTracking.eatenInGrams,
                        protein = nutrients.macros.proteins100g.multiply(ratio),
                        fat = nutrients.macros.fat100g.multiply(ratio),
                        carbs = nutrients.macros.carbohydrates100g.multiply(ratio),
                        fiber = nutrients.macros.fiber100g.multiply(ratio),
                        addedSugar = BigDecimal.ZERO,
                        naturalSugar = BigDecimal.ZERO,
                        saturatedFat = BigDecimal.ZERO,
                        unsaturatedFat = BigDecimal.ZERO,
                        sodium = BigDecimal.ZERO,
                        cholestral = BigDecimal.ZERO,
                        potassium = BigDecimal.ZERO,
                    ),
            ),
    )
}
