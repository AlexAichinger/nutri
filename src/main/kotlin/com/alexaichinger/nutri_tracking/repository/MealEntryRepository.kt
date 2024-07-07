package com.alexaichinger.nutri_tracking.repository

import com.alexaichinger.nutri_tracking.model.MealEntry
import org.springframework.data.mongodb.repository.MongoRepository

interface MealEntryRepository: MongoRepository<MealEntry, String> {
    fun findByUser(user: String): List<MealEntry>
    fun getById(id: String): MealEntry
}