package com.alexaichinger.nutri_tracking.web

import com.alexaichinger.nutri_tracking.dto.MealEntryDto
import com.alexaichinger.nutri_tracking.model.MealEntry
import com.alexaichinger.nutri_tracking.service.MealEntryService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate


@RestController
@RequestMapping("/{user}/meals")
class Meals(
    private val mealService: MealEntryService
) {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    @PostMapping
    fun trackMeal(@PathVariable user: String, @RequestBody meal: MealEntryDto) {
        mealService.logMeal(meal)
    }

    @GetMapping("/{date}")
    fun getMeals(@PathVariable user: String, @PathVariable date: LocalDate): List<MealEntry> {
        return mealService.getMealsTracked(user, date)
    }
}