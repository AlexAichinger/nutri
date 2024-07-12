package com.alexaichinger.nutritracking.dto.external.client

import com.alexaichinger.nutritracking.dto.external.openfoodfacts.v3.OffIngredientsV3Dto
import com.alexaichinger.nutritracking.dto.external.openfoodfacts.v3.OffV3Dto
import java.math.BigDecimal

data class ClientProductInfo(
    val barcode: String,
    val brands: String? = null,
    val ecoScoreGrade: String,
    val ecoScoreScore: Int,
    val foodGroups: String,
    val genericName: String? = null,
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
    var alcohol100g: BigDecimal? = null,
    var betaCarotene100g: BigDecimal? = null,
    var calcium100g: BigDecimal?? = null,
    var cholesterol100g: BigDecimal? = null,
    var copper100g: BigDecimal? = null,
    var fructose100g: BigDecimal? = null,
    var galactose100g: BigDecimal? = null,
    var glucose100g: BigDecimal? = null,
    var iodine100g: BigDecimal? = null,
    var iron100g: BigDecimal? = null,
    var lactose100g: BigDecimal? = null,
    var magnesium100g: BigDecimal? = null,
    var maltose100g: BigDecimal? = null,
    var manganese100g: BigDecimal? = null,
    var pantothenicAcid100g: BigDecimal? = null,
    var phosphorus100g: BigDecimal? = null,
    var phylloquinone100g: BigDecimal? = null,
    var polyols100g: BigDecimal? = null,
    var potassium100g: BigDecimal? = null,
    var selenium100g: BigDecimal? = null,
    var starch100g: BigDecimal? = null,
    var sucrose100g: BigDecimal? = null,
    var vitaminA100g: BigDecimal? = null,
    var vitaminB12100g: BigDecimal? = null,
    var vitaminB100g: BigDecimal? = null,
    var vitaminB2100g: BigDecimal? = null,
    var vitaminB6100g: BigDecimal? = null,
    var vitaminB9100g: BigDecimal? = null,
    var vitaminC100g: BigDecimal? = null,
    var vitaminD100g: BigDecimal? = null,
    var vitaminE100g: BigDecimal? = null,
    var vitaminPp100g: BigDecimal? = null,
    var water100g: BigDecimal? = null,
    var zinc100g: BigDecimal? = null,
    var caffeine: BigDecimal? = null,
)

class ClientIngredients(
    var percentEstimate: Int,
    var vegan: Boolean? = null,
    var vegetarian: Boolean? = null,
    var ingredients: List<ClientIngredients>? = listOf(),
    var text: String,
)

class ClientMacroNutrients(
    var carbohydrates100g: BigDecimal,
    var carbohydratesUnit: String,
    var energyKcal100g: BigDecimal,
    var fat100g: BigDecimal,
    var fatUnit: String,
    var fiber100g: BigDecimal,
    var fiberUnit: String,
    var fruitsVegetablesLegumesEstimateFromIngredients100g: BigDecimal,
    var fruitsVegetablesNutsEstimateFromIngredients100g: BigDecimal,
    var proteins100g: BigDecimal,
    var proteinsUnit: String,
    var sugars100g: BigDecimal,
    var sugarsUnit: String,
)

fun OffV3Dto.toClientDto(): ClientProductInfo {
    return ClientProductInfo(
        barcode = code,
        brands = product.brands,
        ecoScoreGrade = product.ecoScoreGrade,
        ecoScoreScore = product.ecoScoreScore,
        foodGroups = product.foodGroups,
        genericName = product.genericName,
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
                        fiber100g = product.nutriments.fiber100g,
                        fiberUnit = product.nutriments.fiberUnit,
                        fruitsVegetablesLegumesEstimateFromIngredients100g = product.nutriments.fruitsVegetablesLegumesEstimateFromIngredients100g,
                        fruitsVegetablesNutsEstimateFromIngredients100g = product.nutriments.fruitsVegetablesNutsEstimateFromIngredients100g,
                        proteins100g = product.nutriments.proteins100g,
                        proteinsUnit = product.nutriments.proteinsUnit,
                        sugars100g = product.nutriments.sugars100g,
                        sugarsUnit = product.nutriments.sugarsUnit,
                    ),
                micros =
                    ClientMicroNutrients(
                        alcohol100g = product.nutrimentsEstimated?.alcohol100g,
                        betaCarotene100g = product.nutrimentsEstimated?.betaCarotene100g,
                        calcium100g = product.nutrimentsEstimated?.calcium100g,
                        cholesterol100g = product.nutrimentsEstimated?.cholesterol100g,
                        copper100g = product.nutrimentsEstimated?.copper100g,
                        fructose100g = product.nutrimentsEstimated?.fructose100g,
                        galactose100g = product.nutrimentsEstimated?.galactose100g,
                        glucose100g = product.nutrimentsEstimated?.glucose100g,
                        iodine100g = product.nutrimentsEstimated?.iodine100g,
                        iron100g = product.nutrimentsEstimated?.iron100g,
                        lactose100g = product.nutrimentsEstimated?.lactose100g,
                        magnesium100g = product.nutrimentsEstimated?.magnesium100g,
                        maltose100g = product.nutrimentsEstimated?.maltose100g,
                        manganese100g = product.nutrimentsEstimated?.manganese100g,
                        pantothenicAcid100g = product.nutrimentsEstimated?.pantothenicAcid100g,
                        phosphorus100g = product.nutrimentsEstimated?.phosphorus100g,
                        phylloquinone100g = product.nutrimentsEstimated?.phylloquinone100g,
                        polyols100g = product.nutrimentsEstimated?.polyols100g,
                        potassium100g = product.nutrimentsEstimated?.potassium100g,
                        selenium100g = product.nutrimentsEstimated?.selenium100g,
                        starch100g = product.nutrimentsEstimated?.starch100g,
                        sucrose100g = product.nutrimentsEstimated?.sucrose100g,
                        vitaminA100g = product.nutrimentsEstimated?.vitaminA100g,
                        vitaminB12100g = product.nutrimentsEstimated?.vitaminB12100g,
                        vitaminB100g = product.nutrimentsEstimated?.vitaminB100g,
                        vitaminB2100g = product.nutrimentsEstimated?.vitaminB200g,
                        vitaminB6100g = product.nutrimentsEstimated?.vitaminB6100g,
                        vitaminB9100g = product.nutrimentsEstimated?.vitaminB9100g,
                        vitaminC100g = product.nutrimentsEstimated?.vitaminC100g,
                        vitaminD100g = product.nutrimentsEstimated?.vitaminD100g,
                        vitaminE100g = product.nutrimentsEstimated?.vitaminE100g,
                        vitaminPp100g = product.nutrimentsEstimated?.vitaminPp100g,
                        water100g = product.nutrimentsEstimated?.water100g,
                        zinc100g = product.nutrimentsEstimated?.zinc100g,
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
