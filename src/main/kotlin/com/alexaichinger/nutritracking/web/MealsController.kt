package com.alexaichinger.nutritracking.web

import com.alexaichinger.nutritracking.dto.internal.MealEntryDto
import com.alexaichinger.nutritracking.model.MealEntry
import com.alexaichinger.nutritracking.service.MealEntryService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("/{user}/meals")
class MealsController(
    private val mealService: MealEntryService,
) {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    @PostMapping(
        consumes = [MediaType.APPLICATION_JSON_VALUE],
    )
    fun trackMeal(
        @PathVariable user: String,
        @RequestBody meal: MealEntryDto,
    ) {
        mealService.logMeal(meal)
    }

    @GetMapping(
        "/{date}",
        produces = [MediaType.APPLICATION_JSON_VALUE],
    )
    fun getMeals(
        @PathVariable user: String,
        @PathVariable date: LocalDate,
    ): List<MealEntry> {
        return mealService.getMealsTracked(user, date)
    }
}
