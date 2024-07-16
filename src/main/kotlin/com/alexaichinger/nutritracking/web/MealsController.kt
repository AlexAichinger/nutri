package com.alexaichinger.nutritracking.web

import com.alexaichinger.nutritracking.dto.internal.AutomaticTrackingMeal
import com.alexaichinger.nutritracking.dto.internal.ManualMealEntryDto
import com.alexaichinger.nutritracking.model.MealEntry
import com.alexaichinger.nutritracking.service.MealEntryService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
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
        "/manual",
        consumes = [MediaType.APPLICATION_JSON_VALUE],
    )
    fun manualMealTracking(
        @PathVariable user: String,
        @RequestBody meal: ManualMealEntryDto,
    ): ResponseEntity<String> {
        mealService.manualTrackMeal(meal)
        return ResponseEntity("Successfully logged meal.", HttpStatus.ACCEPTED)
    }

    @PostMapping(
        consumes = [MediaType.APPLICATION_JSON_VALUE],
    )
    fun automatedMealTracking(
        @PathVariable user: String,
        @RequestBody meal: AutomaticTrackingMeal,
    ): ResponseEntity<String> {
        mealService.automaticMealTracking(meal)
        return ResponseEntity("Successfully logged meal.", HttpStatus.ACCEPTED)
    }

    @GetMapping(
        "/{date}",
        produces = [MediaType.APPLICATION_JSON_VALUE],
    )
    fun getMeals(
        @PathVariable user: String,
        @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") date: LocalDate,
    ): List<MealEntry> {
        return mealService.getMealsTracked(user, date)
    }
}
