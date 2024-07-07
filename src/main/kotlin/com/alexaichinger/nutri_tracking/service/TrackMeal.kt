package com.alexaichinger.nutri_tracking.service

import com.alexaichinger.nutri_tracking.model.FoodInformation
import com.alexaichinger.nutri_tracking.model.MealEntry
import com.alexaichinger.nutri_tracking.model.MealTime
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate

data class TrackMeal(
    val user: String,
    val mealTime: MealTime,
    @JsonFormat(pattern = "dd/MM/yyyy")
    val loggingDate: LocalDate,
    val foodInformation: FoodInformation,
)

fun TrackMeal.toEntity(): MealEntry {
    return MealEntry(
        user = user,
        mealTime = mealTime,
        loggingDate = loggingDate,
        foodInformation = foodInformation
    )
}