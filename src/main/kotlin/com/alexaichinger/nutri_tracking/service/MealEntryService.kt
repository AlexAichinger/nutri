package com.alexaichinger.nutri_tracking.service

import com.alexaichinger.nutri_tracking.model.MealEntry
import com.alexaichinger.nutri_tracking.repository.MealEntryRepository
import com.alexaichinger.nutri_tracking.web.Meals
import org.springframework.stereotype.Service

@Service
class MealEntryService(
    private val mealEntryRepository: MealEntryRepository
) {
    fun logMeal(entry: TrackMeal): MealEntry {
        val entryToLog = entry.toEntity()
        val savedEntry = mealEntryRepository.save(entryToLog)
        return savedEntry
    }

    fun getMealsTracked(user: String): List<MealEntry> {
        return mealEntryRepository.findByUser(user)
    }
}