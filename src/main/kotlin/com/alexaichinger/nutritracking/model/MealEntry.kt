package com.alexaichinger.nutritracking.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.CompoundIndex
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Document("trackedMeals")
@CompoundIndex(name = "id", def = "{'id': 1")
@CompoundIndex(name = "id", def = "{'user': 1, 'loggingDate': 1, 'mealTime': 1")
data class MealEntry(
    @Id
    val id: String? = null,
    var user: String,
    var mealType: MealType,
    var loggingDate: LocalDate,
    val foodInformation: FoodInformation,
)
