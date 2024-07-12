package com.alexaichinger.nutritracking.service

import com.alexaichinger.nutritracking.dto.internal.MacroNutrientsDto
import com.alexaichinger.nutritracking.dto.internal.NutrientsDto
import com.alexaichinger.nutritracking.model.MealEntry
import com.alexaichinger.nutritracking.repository.MealEntryRepository
import com.alexaichinger.nutritracking.service.helpers.plus
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

        return NutrientsDto(
            macroNutrients = getMacros(entries),
            microNutrients =
        )
    }

    private fun getMacros(entries: List<MealEntry>): MacroNutrientsDto {
        var calories = BigDecimal.ZERO
        var protein = BigDecimal.ZERO
        var fat = BigDecimal.ZERO
        var carbs = BigDecimal.ZERO
        var fiber = BigDecimal.ZERO
        var sugars = BigDecimal.ZERO
        var saturatedFat = BigDecimal.ZERO
        var unsaturatedFat = BigDecimal.ZERO
        var sodium = BigDecimal.ZERO
        var salt = BigDecimal.ZERO

        entries.forEach {
            val info = it.foodInformation.macroNutrients
            calories = plus(calories, info.energyKcal)
            fat = plus(fat, info.fat)
            protein = plus(protein, info.proteins)
            carbs = plus(carbs, info.carbohydrates)
            fiber = plus(fiber, info.fiber)
            sugars = plus(sugars, info.sugars)
            saturatedFat = plus(saturatedFat, info.saturatedFat)
            unsaturatedFat = fat.minus(saturatedFat)
            salt = plus(salt, info.salt)
            sodium = plus(sodium, info.sodium)
        }

        return NutrientsDto(
            energyKcal = calories,
            protein = protein,
            fat = fat,
            carbs = carbs,
            fiber = fiber,
            sugars = sugars,
            saturatedFat = saturatedFat,
            unsaturatedFat = unsaturatedFat,
            sodium = sodium,
            salt = salt
        )
    }
}
