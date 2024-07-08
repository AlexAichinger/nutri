package com.alexaichinger.nutritracking.dto.external.client

import com.alexaichinger.nutritracking.dto.external.openfoodfacts.v3.OffIngredientsV3Dto
import com.alexaichinger.nutritracking.dto.external.openfoodfacts.v3.OffV3Dto
import java.math.BigDecimal

data class ProductInfo(
    val barcode: String,
    val brands: String,
    val ecoScoreGrade: String,
    val ecoScoreScore: Int,
    val foodGroups: String,
    val genericName: String,
    val labels: String,
    val productQuantity: BigDecimal,
    val ingredients: List<Ingredients>? = listOf(),
    val nutrients: Nutrients,
)

data class Nutrients(
    val macros: MacroNutrients,
    val micros: MicroNutrients,
)

data class MicroNutrients(
    var alcohol100g: BigDecimal,
    var betaCarotene100g: BigDecimal,
    var calcium100g: BigDecimal,
    var cholesterol100g: BigDecimal,
    var copper100g: BigDecimal,
    var fructose100g: BigDecimal,
    var galactose100g: BigDecimal,
    var glucose100g: BigDecimal,
    var iodine100g: BigDecimal,
    var iron100g: BigDecimal,
    var lactose100g: BigDecimal,
    var magnesium100g: BigDecimal,
    var maltose100g: BigDecimal,
    var manganese100g: BigDecimal,
    var pantothenicAcid100g: BigDecimal,
    var phosphorus100g: BigDecimal,
    var phylloquinone100g: BigDecimal,
    var polyols100g: BigDecimal,
    var potassium100g: BigDecimal,
    var selenium100g: BigDecimal,
    var starch100g: BigDecimal,
    var sucrose100g: BigDecimal,
    var vitaminA100g: BigDecimal,
    var vitaminB12100g: BigDecimal,
    var vitaminB100g: BigDecimal,
    var vitaminB200g: BigDecimal,
    var vitaminB6100g: BigDecimal,
    var vitaminB9100g: BigDecimal,
    var vitaminC100g: BigDecimal,
    var vitaminD100g: BigDecimal,
    var vitaminE100g: BigDecimal,
    var vitaminPp100g: BigDecimal,
    var water100g: BigDecimal,
    var zinc100g: BigDecimal,
)

class Ingredients(
    var percentEstimate: Int,
    var vegan: Boolean? = null,
    var vegetarian: Boolean? = null,
    var ingredients: List<Ingredients>? = listOf(),
    var text: String,
)

class MacroNutrients(
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

fun OffV3Dto.toClientDto(): ProductInfo {
    return ProductInfo(
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
            Nutrients(
                macros =
                    MacroNutrients(
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
                    MicroNutrients(
                        alcohol100g = product.nutrimentsEstimated.alcohol100g,
                        betaCarotene100g = product.nutrimentsEstimated.betaCarotene100g,
                        calcium100g = product.nutrimentsEstimated.calcium100g,
                        cholesterol100g = product.nutrimentsEstimated.cholesterol100g,
                        copper100g = product.nutrimentsEstimated.copper100g,
                        fructose100g = product.nutrimentsEstimated.fructose100g,
                        galactose100g = product.nutrimentsEstimated.galactose100g,
                        glucose100g = product.nutrimentsEstimated.glucose100g,
                        iodine100g = product.nutrimentsEstimated.iodine100g,
                        iron100g = product.nutrimentsEstimated.iron100g,
                        lactose100g = product.nutrimentsEstimated.lactose100g,
                        magnesium100g = product.nutrimentsEstimated.magnesium100g,
                        maltose100g = product.nutrimentsEstimated.maltose100g,
                        manganese100g = product.nutrimentsEstimated.manganese100g,
                        pantothenicAcid100g = product.nutrimentsEstimated.pantothenicAcid100g,
                        phosphorus100g = product.nutrimentsEstimated.phosphorus100g,
                        phylloquinone100g = product.nutrimentsEstimated.phylloquinone100g,
                        polyols100g = product.nutrimentsEstimated.polyols100g,
                        potassium100g = product.nutrimentsEstimated.potassium100g,
                        selenium100g = product.nutrimentsEstimated.selenium100g,
                        starch100g = product.nutrimentsEstimated.starch100g,
                        sucrose100g = product.nutrimentsEstimated.sucrose100g,
                        vitaminA100g = product.nutrimentsEstimated.vitaminA100g,
                        vitaminB12100g = product.nutrimentsEstimated.vitaminB12100g,
                        vitaminB100g = product.nutrimentsEstimated.vitaminB100g,
                        vitaminB200g = product.nutrimentsEstimated.vitaminB200g,
                        vitaminB6100g = product.nutrimentsEstimated.vitaminB6100g,
                        vitaminB9100g = product.nutrimentsEstimated.vitaminB9100g,
                        vitaminC100g = product.nutrimentsEstimated.vitaminC100g,
                        vitaminD100g = product.nutrimentsEstimated.vitaminD100g,
                        vitaminE100g = product.nutrimentsEstimated.vitaminE100g,
                        vitaminPp100g = product.nutrimentsEstimated.vitaminPp100g,
                        water100g = product.nutrimentsEstimated.water100g,
                        zinc100g = product.nutrimentsEstimated.zinc100g,
                    ),
            ),
    )
}

fun OffIngredientsV3Dto.toClientDto(): Ingredients {
    return Ingredients(
        percentEstimate = 0,
        vegan = vegan == "yes",
        vegetarian = vegetarian == "yes",
        text = text,
        ingredients = ingredients?.map { it.toClientDto() },
    )
}
