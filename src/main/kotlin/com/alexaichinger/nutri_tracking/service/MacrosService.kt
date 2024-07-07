package com.alexaichinger.nutri_tracking.service

import com.alexaichinger.nutri_tracking.dto.MacrosDto
import com.alexaichinger.nutri_tracking.model.MealEntry
import com.alexaichinger.nutri_tracking.repository.MealEntryRepository
import org.springframework.stereotype.Service
import java.math.BigDecimal
import java.time.LocalDate

@Service
class MacrosService(
    private val repository: MealEntryRepository
) {
    fun getUserMacros(user: String, day: LocalDate): MacrosDto {
        val entries = repository.findByUserAndLoggingDate(user, day)

        return getMacros(entries)
    }

    private fun getMacros(entries: List<MealEntry>): MacrosDto {
        var calories = BigDecimal.ZERO
        var protein = BigDecimal.ZERO
        var fat = BigDecimal.ZERO
        var carbs = BigDecimal.ZERO
        var fiber = BigDecimal.ZERO
        var addedSugar = BigDecimal.ZERO
        var naturalSugar = BigDecimal.ZERO
        var saturatedFat = BigDecimal.ZERO
        var unsaturatedFat = BigDecimal.ZERO
        var sodium = BigDecimal.ZERO
        var cholestral = BigDecimal.ZERO
        var potassium = BigDecimal.ZERO

        entries.forEach {
            val info = it.foodInformation.nutritionInformation
            calories = plus(calories, info.calories)
            fat = plus(fat, info.fat)
            protein = plus(protein, info.protein)
            carbs = plus(carbs, info.carbs)
            fiber = plus(fiber, info.fiber)
            addedSugar = plus(addedSugar, info.addedSugar)
            naturalSugar = plus(naturalSugar, info.naturalSugar)
            saturatedFat = plus(saturatedFat, info.saturatedFat)
            unsaturatedFat = plus(unsaturatedFat, info.unsaturatedFat)
            sodium = plus(sodium, info.sodium)
            cholestral = plus(cholestral, info.cholestral)
            potassium = plus(potassium, info.potassium)
        }

        return MacrosDto(
            calories,
            protein,
            fat,
            carbs,
            fiber,
            addedSugar,
            naturalSugar,
            saturatedFat,
            unsaturatedFat,
            sodium,
            cholestral,
            potassium,
        )
    }

    fun plus(num: BigDecimal, number: BigDecimal?): BigDecimal {
        return if (number == null) num else num.plus(number)
    }
}

