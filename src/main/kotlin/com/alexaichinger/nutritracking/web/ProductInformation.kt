package com.alexaichinger.nutritracking.web

import com.alexaichinger.nutritracking.service.OpenFoodFactsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product")
class ProductInformation(
    private val foodFactsService: OpenFoodFactsService,
) {
    @GetMapping("/{barcode}")
    fun getProduct(
        @PathVariable barcode: String,
    ): String? {
        return foodFactsService.getProductInfo(barcode)
    }
}
