package com.alexaichinger.nutritracking.web

import com.alexaichinger.nutritracking.dto.internal.NutrientsDto
import com.alexaichinger.nutritracking.service.MacrosService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController
@RequestMapping("/{user}/macros")
class MacronutrientsController(
    private val macrosService: MacrosService,
) {
    @GetMapping(
        "/{date}",
        produces = [MediaType.APPLICATION_JSON_VALUE],
    )
    fun getTotalNutrients(
        @PathVariable user: String,
        @PathVariable date: LocalDate,
    ): NutrientsDto {
        return macrosService.getTotalUserNutrients(user, date)
    }
}
