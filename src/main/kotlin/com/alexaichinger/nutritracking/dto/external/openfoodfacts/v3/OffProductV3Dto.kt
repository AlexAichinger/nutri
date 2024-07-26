package com.alexaichinger.nutritracking.dto.external.openfoodfacts.v3

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.math.BigDecimal

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffProductV3Dto(
    var brands: String? = null,
    @JsonAlias("brands_tags")
    var brandsTags: List<String> = listOf(),
    @JsonAlias("additives_n")
    var additivesN: Int? = null,
    @JsonAlias("additives_original_tags")
    var additivesOriginalTags: List<String> = listOf(),
    @JsonAlias("categories_properties_tags")
    var categoriesPropertiesTags: List<String> = listOf(),
    var categories: String? = null,
    @JsonAlias("countries_hierarchy")
    var countriesHierarchy: List<String> = listOf(),
    @JsonAlias("countries_tags")
    var countriesTags: List<String> = listOf(),
    @JsonAlias("data_sources_tags")
    var dataSourcesTags: List<String> = listOf(),
    @JsonAlias("ecoscore_data")
    var ecoScoreData: OffEcoScoreDataV3Dto? = null,
    @JsonAlias("ecoscore_grade")
    var ecoScoreGrade: String? = null,
    @JsonAlias("ecoscore_score")
    var ecoScoreScore: Int? = null,
    @JsonAlias("food_groups")
    var foodGroups: String? = null,
    @JsonAlias("fruits-vegetables-nuts_100g_estimate")
    var fruitsVegetablesNuts100gEstimate: Int? = null,
    @JsonAlias("generic_name")
    val genericName: String? = null,
    var ingredients: List<OffIngredientsV3Dto> = listOf(),
    @JsonAlias("ingredients_analysis_tags")
    var ingredientsAnalysisTags: List<String> = listOf(),
    @JsonAlias("ingredients_n")
    var ingredientsN: Int? = null,
    @JsonAlias("ingredients_tags")
    var ingredientsTags: List<String> = listOf(),
    @JsonAlias("ingredients_text_en")
    var ingredientsTextEn: String? = null,
    var labels: String? = null,
    @JsonAlias("manufacturing_places")
    var manufacturingPlaces: String? = null,
    @JsonAlias("nova_group")
    var novaGroup: Int? = null,
    @JsonAlias("nova_groups_tags")
    var novaGroupsTags: List<String> = listOf(),
    var nutriments: OffNutrimentsV3Dto,
    @JsonAlias("nutriments_estimated")
    var nutrimentsEstimated: OffNutrimentsEstimatedV3Dto? = null,
    @JsonAlias("popularity_tags")
    var popularityTags: List<String> = listOf(),
    @JsonAlias("product_name")
    var productName: String? = null,
    @JsonAlias("product_name_en")
    var productNameEn: String? = null,
    @JsonAlias("product_quantity")
    var productQuantity: BigDecimal? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffNutrimentsEstimatedV3Dto(
    @JsonAlias("alcohol_100g")
    var alcohol100g: BigDecimal? = null,
    @JsonAlias("beta-carotene_100g")
    var betaCarotene100g: BigDecimal? = null,
    @JsonAlias("calcium_100g")
    var calcium100g: BigDecimal? = null,
    @JsonAlias("cholesterol_100g")
    var cholesterol100g: BigDecimal? = null,
    @JsonAlias("copper_100g")
    var copper100g: BigDecimal? = null,
    @JsonAlias("fructose_100g")
    var fructose100g: BigDecimal? = null,
    @JsonAlias("galactose_100g")
    var galactose100g: BigDecimal? = null,
    @JsonAlias("glucose_100g")
    var glucose100g: BigDecimal? = null,
    @JsonAlias("iodine_100g")
    var iodine100g: BigDecimal? = null,
    @JsonAlias("iron_100g")
    var iron100g: BigDecimal? = null,
    @JsonAlias("lactose_100g")
    var lactose100g: BigDecimal? = null,
    @JsonAlias("magnesium_100g")
    var magnesium100g: BigDecimal? = null,
    @JsonAlias("maltose_100g")
    var maltose100g: BigDecimal? = null,
    @JsonAlias("manganese_100g")
    var manganese100g: BigDecimal? = null,
    @JsonAlias("pantothenic-acid_100g")
    var pantothenicAcid100g: BigDecimal? = null,
    @JsonAlias("phosphorus_100g")
    var phosphorus100g: BigDecimal? = null,
    @JsonAlias("phylloquinone_100g")
    var phylloquinone100g: BigDecimal? = null,
    @JsonAlias("polyols_100g")
    var polyols100g: BigDecimal? = null,
    @JsonAlias("potassium_100g")
    var potassium100g: BigDecimal? = null,
    @JsonAlias("selenium_100g")
    var selenium100g: BigDecimal? = null,
    @JsonAlias("starch_100g")
    var starch100g: BigDecimal? = null,
    @JsonAlias("sucrose_100g")
    var sucrose100g: BigDecimal? = null,
    @JsonAlias("vitamin-a_100g")
    var vitaminA100g: BigDecimal? = null,
    @JsonAlias("vitamin-b12_100g")
    var vitaminB12100g: BigDecimal? = null,
    @JsonAlias("vitamin-b1_100g")
    var vitaminB100g: BigDecimal? = null,
    @JsonAlias("vitamin-b2_100g")
    var vitaminB200g: BigDecimal? = null,
    @JsonAlias("vitamin-b6_100g")
    var vitaminB6100g: BigDecimal? = null,
    @JsonAlias("vitamin-b9_100g")
    var vitaminB9100g: BigDecimal? = null,
    @JsonAlias("vitamin-c_100g")
    var vitaminC100g: BigDecimal? = null,
    @JsonAlias("vitamin-d_100g")
    var vitaminD100g: BigDecimal? = null,
    @JsonAlias("vitamin-e_100g")
    var vitaminE100g: BigDecimal? = null,
    @JsonAlias("vitamin-pp_100g")
    var vitaminPp100g: BigDecimal? = null,
    @JsonAlias("water_100g")
    var water100g: BigDecimal? = null,
    @JsonAlias("zinc_100g")
    var zinc100g: BigDecimal? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffNutrimentsV3Dto(
    var carbohydrates: BigDecimal? = null,
    @JsonAlias("carbohydrates_100g")
    var carbohydrates100g: BigDecimal? = null,
    @JsonAlias("carbohydrates_unit")
    var carbohydratesUnit: String? = null,
    @JsonAlias("energy-kcal")
    var energyKcal: BigDecimal? = null,
    @JsonAlias("energy-kcal_100g")
    var energyKcal100g: BigDecimal? = null,
    @JsonAlias("fat")
    var fat: BigDecimal? = null,
    @JsonAlias("fat_100g")
    var fat100g: BigDecimal? = null,
    @JsonAlias("fat_unit")
    var fatUnit: String? = null,
    @JsonAlias("fiber")
    var fiber: BigDecimal? = BigDecimal.ZERO,
    @JsonAlias("fiber_100g")
    var fiber100g: BigDecimal? = BigDecimal.ZERO,
    @JsonAlias("fiber_unit")
    var fiberUnit: String? = null,
    @JsonAlias("fruits-vegetables-legumes-estimate-from-ingredients_100g")
    var fruitsVegetablesLegumesEstimateFromIngredients100g: BigDecimal? = null,
    @JsonAlias("fruits-vegetables-legumes-estimate-from-ingredients_serving")
    var fruitsVegetablesLegumesEstimateFromIngredientsServing: BigDecimal? = null,
    @JsonAlias("fruits-vegetables-nuts-estimate-from-ingredients_100g")
    var fruitsVegetablesNutsEstimateFromIngredients100g: BigDecimal? = null,
    @JsonAlias("fruits-vegetables-nuts-estimate-from-ingredients_serving")
    var fruitsVegetablesNutsEstimateFromIngredientsServing: BigDecimal? = null,
    @JsonAlias("proteins")
    var proteins: BigDecimal? = null,
    @JsonAlias("proteins_100g")
    var proteins100g: BigDecimal? = null,
    @JsonAlias("proteins_unit")
    var proteinsUnit: String? = null,
    @JsonAlias("salt")
    var salt: BigDecimal? = null,
    @JsonAlias("salt_100g")
    var salt100g: BigDecimal? = null,
    @JsonAlias("salt_unit")
    var saltUnit: String? = null,
    @JsonAlias("saturated-fat")
    var saturatedFat: BigDecimal? = null,
    @JsonAlias("saturated-fat_100g")
    var saturatedFat100g: BigDecimal? = null,
    @JsonAlias("saturated-fat_unit")
    var saturatedFatUnit: String? = null,
    @JsonAlias("sodium")
    var sodium: BigDecimal? = null,
    @JsonAlias("sodium_100g")
    var sodium100g: BigDecimal? = null,
    @JsonAlias("sodium_unit")
    var sodiumUnit: String? = null,
    @JsonAlias("sugars")
    var sugars: BigDecimal? = null,
    @JsonAlias("sugars_100g")
    var sugars100g: BigDecimal? = null,
    @JsonAlias("sugars_unit")
    var sugarsUnit: String? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffIngredientsV3Dto(
    @JsonAlias("ciqual_food_code")
    var ciqualFoodCode: String? = null,
    var id: String? = null,
    @JsonAlias("percent_estimate")
    var percentEstimate: Int? = null,
    var vegan: String? = null,
    var vegetarian: String? = null,
    var ingredients: List<OffIngredientsV3Dto>? = listOf(),
    var text: String? = null,
)
