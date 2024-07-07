package com.alexaichinger.nutri_tracking.web

import com.alexaichinger.nutri_tracking.dto.MacrosDto
import com.alexaichinger.nutri_tracking.service.MacrosService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("/{user}/macros")
class Macronutrients(
    private val macrosService: MacrosService
) {
    @GetMapping("/{date}")
    fun getMeals(@PathVariable user: String, @PathVariable date: LocalDate): MacrosDto {
        return macrosService.getUserMacros(user, date)
    }
}