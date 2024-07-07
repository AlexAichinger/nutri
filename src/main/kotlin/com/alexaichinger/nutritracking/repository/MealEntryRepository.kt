package com.alexaichinger.nutritracking.repository

import com.alexaichinger.nutritracking.model.MealEntry
import org.springframework.data.mongodb.repository.MongoRepository
import java.time.LocalDate

interface MealEntryRepository : MongoRepository<MealEntry, String> {
    fun findByUser(user: String): List<MealEntry>

    fun findByUserAndLoggingDate(
        user: String,
        loggingDate: LocalDate,
    ): List<MealEntry>

    fun getById(id: String): MealEntry
}
