package com.alexaichinger.nutritracking.web

import com.alexaichinger.nutritracking.dto.external.client.ClientProductInfo
import com.alexaichinger.nutritracking.service.openfoodfacts.OpenFoodFactsService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductInformationController(
    private val foodFactsService: OpenFoodFactsService,
) {
    @GetMapping(
        "/{barcode}",
        produces = [MediaType.APPLICATION_JSON_VALUE],
    )
    fun getProduct(
        @PathVariable barcode: String,
    ): ClientProductInfo? {
        return foodFactsService.getProductInfo(barcode)
    }
}
