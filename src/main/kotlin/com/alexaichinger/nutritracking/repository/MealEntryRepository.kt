package com.alexaichinger.nutritracking.repository

import com.alexaichinger.nutritracking.model.nutrition.MealEntry
import org.springframework.data.mongodb.repository.MongoRepository
import java.time.LocalDateTime

interface MealEntryRepository : MongoRepository<MealEntry, String> {
    fun findByUserAndLoggingDateBetween(
        user: String,
        start: LocalDateTime,
        end: LocalDateTime,
    ): List<MealEntry>
}
