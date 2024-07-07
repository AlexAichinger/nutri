package com.alexaichinger.nutri_tracking.service

import com.alexaichinger.nutri_tracking.dto.MealEntryDto
import com.alexaichinger.nutri_tracking.dto.toEntity
import com.alexaichinger.nutri_tracking.model.MealEntry
import com.alexaichinger.nutri_tracking.repository.MealEntryRepository
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class MealEntryService(
    private val mealEntryRepository: MealEntryRepository
) {
    fun logMeal(entry: MealEntryDto): MealEntry {
        val entryToLog = entry.toEntity()
        val savedEntry = mealEntryRepository.save(entryToLog)
        return savedEntry
    }

    fun getMealsTracked(user: String, date: LocalDate): List<MealEntry> {
        return mealEntryRepository.findByUserAndLoggingDate(user, date)
    }
}