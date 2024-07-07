package com.alexaichinger.nutritracking.service

import com.alexaichinger.nutritracking.dto.internal.MealEntryDto
import com.alexaichinger.nutritracking.dto.internal.toEntity
import com.alexaichinger.nutritracking.model.MealEntry
import com.alexaichinger.nutritracking.repository.MealEntryRepository
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class MealEntryService(
    private val mealEntryRepository: MealEntryRepository,
) {
    fun logMeal(entry: MealEntryDto): MealEntry {
        val entryToLog = entry.toEntity()
        val savedEntry = mealEntryRepository.save(entryToLog)
        return savedEntry
    }

    fun getMealsTracked(
        user: String,
        date: LocalDate,
    ): List<MealEntry> {
        return mealEntryRepository.findByUserAndLoggingDate(user, date)
    }
}
