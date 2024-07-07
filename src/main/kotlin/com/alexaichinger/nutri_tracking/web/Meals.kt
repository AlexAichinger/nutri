package com.alexaichinger.nutri_tracking.web

import com.alexaichinger.nutri_tracking.model.MealEntry
import com.alexaichinger.nutri_tracking.service.MealEntryService
import com.alexaichinger.nutri_tracking.service.TrackMeal
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/meals")
class Meals(
    private val mealService: MealEntryService
) {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    @PostMapping
    fun trackMeal(@RequestBody meal: TrackMeal) {
        mealService.logMeal(meal)
    }

    @GetMapping("/{user}")
    fun getMeals(@PathVariable user: String): List<MealEntry> {
        return mealService.getMealsTracked(user)
    }

    @GetMapping
    fun getMeals() {

    }
}