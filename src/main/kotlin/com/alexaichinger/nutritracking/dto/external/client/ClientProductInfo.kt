package com.alexaichinger.nutritracking.dto.external.client

import com.alexaichinger.nutritracking.dto.external.openfoodfacts.v3.OffIngredientsV3Dto
import com.alexaichinger.nutritracking.dto.external.openfoodfacts.v3.OffV3Dto
import java.math.BigDecimal

data class ClientProductInfo(
    val barcode: String? = null,
    val brands: String? = null,
    val ecoScoreGrade: String? = null,
    val ecoScoreScore: Int? = null,
    val foodGroups: String? = null,
    val productNameEn: String? = null,
    val labels: String? = null,
    val productQuantity: BigDecimal? = null,
    val ingredients: List<ClientIngredients>? = listOf(),
    val nutrients: ClientNutrients,
)

data class ClientNutrients(
    val macros: ClientMacroNutrients,
    val micros: ClientMicroNutrients,
)

data class ClientMicroNutrients(
    val alcohol100g: BigDecimal? = null,
    val betaCarotene100g: BigDecimal? = null,
    val calcium100g: BigDecimal? = null,
    val cholesterol100g: BigDecimal? = null,
    val copper100g: BigDecimal? = null,
    val fructose100g: BigDecimal? = null,
    val galactose100g: BigDecimal? = null,
    val glucose100g: BigDecimal? = null,
    val iodine100g: BigDecimal? = null,
    val iron100g: BigDecimal? = null,
    val lactose100g: BigDecimal? = null,
    val magnesium100g: BigDecimal? = null,
    val maltose100g: BigDecimal? = null,
    val manganese100g: BigDecimal? = null,
    val pantothenicAcid100g: BigDecimal? = null,
    val phosphorus100g: BigDecimal? = null,
    val phylloquinone100g: BigDecimal? = null,
    val polyols100g: BigDecimal? = null,
    val potassium100g: BigDecimal? = null,
    val selenium100g: BigDecimal? = null,
    val starch100g: BigDecimal? = null,
    val sucrose100g: BigDecimal? = null,
    val vitaminA100g: BigDecimal? = null,
    val vitaminB12100g: BigDecimal? = null,
    val vitaminB100g: BigDecimal? = null,
    val vitaminB2100g: BigDecimal? = null,
    val vitaminB6100g: BigDecimal? = null,
    val vitaminB9100g: BigDecimal? = null,
    val vitaminC100g: BigDecimal? = null,
    val vitaminD100g: BigDecimal? = null,
    val vitaminE100g: BigDecimal? = null,
    val vitaminPp100g: BigDecimal? = null,
    val water100g: BigDecimal? = null,
    val zinc100g: BigDecimal? = null,
    val caffeine: BigDecimal? = null,
)

class ClientIngredients(
    val percentEstimate: Int? = null,
    val vegan: Boolean? = null,
    val vegetarian: Boolean? = null,
    val ingredients: List<ClientIngredients>? = listOf(),
    val text: String? = null,
)

class ClientMacroNutrients(
    val carbohydrates100g: BigDecimal? = null,
    val carbohydratesUnit: String? = null,
    val energyKcal100g: BigDecimal? = null,
    val fat100g: BigDecimal? = null,
    val fatUnit: String? = null,
    val fiber100g: BigDecimal? = null,
    val fiberUnit: String? = null,
    val fruitsVegetablesLegumesEstimateFromIngredients100g: BigDecimal? = null,
    val fruitsVegetablesNutsEstimateFromIngredients100g: BigDecimal? = null,
    val proteins100g: BigDecimal? = null,
    val proteinsUnit: String? = null,
    val salt100g: BigDecimal? = null,
    val saltUnit: String? = null,
    val saturatedFat100g: BigDecimal? = null,
    val saturatedFatUnit: String? = null,
    val sodium100g: BigDecimal? = null,
    val sodiumUnit: String? = null,
    val sugars100g: BigDecimal? = null,
    val sugarsUnit: String? = null,
)

fun OffV3Dto.toClientDto(): ClientProductInfo {
    return ClientProductInfo(
        barcode = code,
        brands = product.brands,
        ecoScoreGrade = product.ecoScoreGrade,
        ecoScoreScore = product.ecoScoreScore,
        foodGroups = product.foodGroups,
        productNameEn = product.productNameEn,
        labels = product.labels,
        productQuantity = product.productQuantity,
        ingredients = product.ingredients.map { it.toClientDto() },
        nutrients =
            ClientNutrients(
                macros =
                    ClientMacroNutrients(
                        carbohydrates100g = product.nutriments.carbohydrates100g,
                        carbohydratesUnit = product.nutriments.carbohydratesUnit,
                        energyKcal100g = product.nutriments.energyKcal100g,
                        fat100g = product.nutriments.fat100g,
                        fatUnit = product.nutriments.fatUnit,
                        fiber100g = product.nutriments.fiber100g ?: BigDecimal.ZERO,
                        fiberUnit = product.nutriments.fiberUnit ?: "g",
                        fruitsVegetablesLegumesEstimateFromIngredients100g = product.nutriments.fruitsVegetablesLegumesEstimateFromIngredients100g,
                        fruitsVegetablesNutsEstimateFromIngredients100g = product.nutriments.fruitsVegetablesNutsEstimateFromIngredients100g,
                        proteins100g = product.nutriments.proteins100g,
                        proteinsUnit = product.nutriments.proteinsUnit,
                        salt100g = product.nutriments.salt100g,
                        saltUnit = product.nutriments.saltUnit,
                        saturatedFat100g = product.nutriments.saturatedFat100g,
                        saturatedFatUnit = product.nutriments.saturatedFatUnit,
                        sodium100g = product.nutriments.sodium100g,
                        sodiumUnit = product.nutriments.sodiumUnit,
                        sugars100g = product.nutriments.sugars100g,
                        sugarsUnit = product.nutriments.sugarsUnit,
                    ),
                micros =
                    ClientMicroNutrients(
                        alcohol100g = product.nutrimentsEstimated?.alcohol100g ?: BigDecimal.ZERO,
                        betaCarotene100g = product.nutrimentsEstimated?.betaCarotene100g ?: BigDecimal.ZERO,
                        calcium100g = product.nutrimentsEstimated?.calcium100g ?: BigDecimal.ZERO,
                        cholesterol100g = product.nutrimentsEstimated?.cholesterol100g ?: BigDecimal.ZERO,
                        copper100g = product.nutrimentsEstimated?.copper100g ?: BigDecimal.ZERO,
                        fructose100g = product.nutrimentsEstimated?.fructose100g ?: BigDecimal.ZERO,
                        galactose100g = product.nutrimentsEstimated?.galactose100g ?: BigDecimal.ZERO,
                        glucose100g = product.nutrimentsEstimated?.glucose100g ?: BigDecimal.ZERO,
                        iodine100g = product.nutrimentsEstimated?.iodine100g ?: BigDecimal.ZERO,
                        iron100g = product.nutrimentsEstimated?.iron100g ?: BigDecimal.ZERO,
                        lactose100g = product.nutrimentsEstimated?.lactose100g ?: BigDecimal.ZERO,
                        magnesium100g = product.nutrimentsEstimated?.magnesium100g ?: BigDecimal.ZERO,
                        maltose100g = product.nutrimentsEstimated?.maltose100g ?: BigDecimal.ZERO,
                        manganese100g = product.nutrimentsEstimated?.manganese100g ?: BigDecimal.ZERO,
                        pantothenicAcid100g = product.nutrimentsEstimated?.pantothenicAcid100g ?: BigDecimal.ZERO,
                        phosphorus100g = product.nutrimentsEstimated?.phosphorus100g ?: BigDecimal.ZERO,
                        phylloquinone100g = product.nutrimentsEstimated?.phylloquinone100g ?: BigDecimal.ZERO,
                        polyols100g = product.nutrimentsEstimated?.polyols100g ?: BigDecimal.ZERO,
                        potassium100g = product.nutrimentsEstimated?.potassium100g ?: BigDecimal.ZERO,
                        selenium100g = product.nutrimentsEstimated?.selenium100g ?: BigDecimal.ZERO,
                        starch100g = product.nutrimentsEstimated?.starch100g ?: BigDecimal.ZERO,
                        sucrose100g = product.nutrimentsEstimated?.sucrose100g ?: BigDecimal.ZERO,
                        vitaminA100g = product.nutrimentsEstimated?.vitaminA100g ?: BigDecimal.ZERO,
                        vitaminB12100g = product.nutrimentsEstimated?.vitaminB12100g ?: BigDecimal.ZERO,
                        vitaminB100g = product.nutrimentsEstimated?.vitaminB100g ?: BigDecimal.ZERO,
                        vitaminB2100g = product.nutrimentsEstimated?.vitaminB200g ?: BigDecimal.ZERO,
                        vitaminB6100g = product.nutrimentsEstimated?.vitaminB6100g ?: BigDecimal.ZERO,
                        vitaminB9100g = product.nutrimentsEstimated?.vitaminB9100g ?: BigDecimal.ZERO,
                        vitaminC100g = product.nutrimentsEstimated?.vitaminC100g ?: BigDecimal.ZERO,
                        vitaminD100g = product.nutrimentsEstimated?.vitaminD100g ?: BigDecimal.ZERO,
                        vitaminE100g = product.nutrimentsEstimated?.vitaminE100g ?: BigDecimal.ZERO,
                        vitaminPp100g = product.nutrimentsEstimated?.vitaminPp100g ?: BigDecimal.ZERO,
                        water100g = product.nutrimentsEstimated?.water100g ?: BigDecimal.ZERO,
                        zinc100g = product.nutrimentsEstimated?.zinc100g ?: BigDecimal.ZERO,
                    ),
            ),
    )
}

fun OffIngredientsV3Dto.toClientDto(): ClientIngredients {
    return ClientIngredients(
        percentEstimate = 0,
        vegan = vegan == "yes",
        vegetarian = vegetarian == "yes",
        text = text,
        ingredients = ingredients?.map { it.toClientDto() },
    )
}
