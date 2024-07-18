package com.alexaichinger.nutritracking.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.CompoundIndex
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document("trackedMeals")
@CompoundIndex(name = "id", def = "{'id': 1}")
@CompoundIndex(name = "user-date-mealType", def = "{'user': 1, 'loggingDate': 1, 'mealType': 1}")
data class MealEntry(
    @Id
    val id: String? = null,
    var user: String,
    var mealType: MealType,
    var loggingDate: LocalDateTime,
    val foodInformation: FoodInformation,
)
