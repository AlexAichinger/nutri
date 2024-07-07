package com.alexaichinger.nutri_tracking.dto

import com.alexaichinger.nutri_tracking.model.MealEntry
import com.alexaichinger.nutri_tracking.model.MealTime
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate

data class MealEntryDto(
    val user: String,
    val mealTime: MealTime,
    @JsonFormat(pattern = "dd/MM/yyyy")
    val loggingDate: LocalDate,
    val foodInformation: FoodInformationDto,
)

fun MealEntryDto.toEntity(): MealEntry {
    return MealEntry(
        user = user,
        mealTime = mealTime,
        loggingDate = loggingDate,
        foodInformation = foodInformation.toEntity()
    )
}