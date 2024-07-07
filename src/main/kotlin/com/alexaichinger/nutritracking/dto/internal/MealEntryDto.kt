package com.alexaichinger.nutritracking.dto.internal

import com.alexaichinger.nutritracking.model.MealEntry
import com.alexaichinger.nutritracking.model.MealTime
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
        foodInformation = foodInformation.toEntity(),
    )
}
