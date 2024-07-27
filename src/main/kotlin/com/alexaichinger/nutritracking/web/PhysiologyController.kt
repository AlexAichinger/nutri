package com.alexaichinger.nutritracking.web

import com.alexaichinger.nutritracking.service.health.PhysiologyDto
import com.alexaichinger.nutritracking.service.health.PhysiologyService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/physiology")
class PhysiologyController(
    private val physiologyService: PhysiologyService,
) {
    @PostMapping(
        "/{user}",
        consumes = [MediaType.APPLICATION_JSON_VALUE],
    )
    fun updateUserPhysiology(
        @PathVariable user: String,
        @RequestBody physiology: PhysiologyDto,
    ) {
        physiologyService.updateUserPhysiology(user, physiology)
    }
}
