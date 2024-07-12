package com.alexaichinger.nutritracking.dto.external.openfoodfacts.v3

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.math.BigDecimal

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffProductV3Dto(
    var brands: String,
    @JsonAlias("brands_tags")
    var brandsTags: List<String>,
    @JsonAlias("additives_n")
    var additivesN: Int? = null,
    @JsonAlias("additives_original_tags")
    var additivesOriginalTags: List<String>? = listOf(),
    @JsonAlias("categories_properties_tags")
    var categoriesPropertiesTags: List<String>,
    var categories: String? = null,
    @JsonAlias("countries_hierarchy")
    var countriesHierarchy: List<String>,
    @JsonAlias("countries_tags")
    var countriesTags: List<String>,
    @JsonAlias("data_sources_tags")
    var dataSourcesTags: List<String>,
    @JsonAlias("ecoscore_data")
    var ecoScoreData: OffEcoScoreDataV3Dto? = null,
    @JsonAlias("ecoscore_grade")
    var ecoScoreGrade: String,
    @JsonAlias("ecoscore_score")
    var ecoScoreScore: Int,
    @JsonAlias("food_groups")
    var foodGroups: String,
    @JsonAlias("fruits-vegetables-nuts_100g_estimate")
    var fruitsVegetablesNuts100gEstimate: Int,
    @JsonAlias("generic_name")
    val genericName: String? = null,
    var ingredients: List<OffIngredientsV3Dto>,
    @JsonAlias("ingredients_analysis_tags")
    var ingredientsAnalysisTags: List<String>,
    @JsonAlias("ingredients_n")
    var ingredientsN: Int,
    @JsonAlias("ingredients_tags")
    var ingredientsTags: List<String>,
    @JsonAlias("ingredients_text_en")
    var ingredientsTextEn: String? = null,
    var labels: String? = null,
    @JsonAlias("manufacturing_places")
    var manufacturingPlaces: String? = null,
    @JsonAlias("nova_group")
    var novaGroup: Int,
    @JsonAlias("nova_groups_tags")
    var novaGroupsTags: List<String>,
    var nutriments: OffNutrimentsV3Dto,
    @JsonAlias("nutriments_estimated")
    var nutrimentsEstimated: OffNutrimentsEstimatedV3Dto? = null,
    @JsonAlias("popularity_tags")
    var popularityTags: List<String>,
    @JsonAlias("product_name")
    var productName: String,
    @JsonAlias("product_name_en")
    var productNameEn: String? = null,
    @JsonAlias("product_quantity")
    var productQuantity: BigDecimal? = null,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffNutrimentsEstimatedV3Dto(
    @JsonAlias("alcohol_100g")
    var alcohol100g: BigDecimal,
    @JsonAlias("beta-carotene_100g")
    var betaCarotene100g: BigDecimal,
    @JsonAlias("calcium_100g")
    var calcium100g: BigDecimal,
    @JsonAlias("cholesterol_100g")
    var cholesterol100g: BigDecimal,
    @JsonAlias("copper_100g")
    var copper100g: BigDecimal,
    @JsonAlias("fructose_100g")
    var fructose100g: BigDecimal,
    @JsonAlias("galactose_100g")
    var galactose100g: BigDecimal,
    @JsonAlias("glucose_100g")
    var glucose100g: BigDecimal,
    @JsonAlias("iodine_100g")
    var iodine100g: BigDecimal,
    @JsonAlias("iron_100g")
    var iron100g: BigDecimal,
    @JsonAlias("lactose_100g")
    var lactose100g: BigDecimal,
    @JsonAlias("magnesium_100g")
    var magnesium100g: BigDecimal,
    @JsonAlias("maltose_100g")
    var maltose100g: BigDecimal,
    @JsonAlias("manganese_100g")
    var manganese100g: BigDecimal,
    @JsonAlias("pantothenic-acid_100g")
    var pantothenicAcid100g: BigDecimal,
    @JsonAlias("phosphorus_100g")
    var phosphorus100g: BigDecimal,
    @JsonAlias("phylloquinone_100g")
    var phylloquinone100g: BigDecimal,
    @JsonAlias("polyols_100g")
    var polyols100g: BigDecimal,
    @JsonAlias("potassium_100g")
    var potassium100g: BigDecimal,
    @JsonAlias("selenium_100g")
    var selenium100g: BigDecimal,
    @JsonAlias("starch_100g")
    var starch100g: BigDecimal,
    @JsonAlias("sucrose_100g")
    var sucrose100g: BigDecimal,
    @JsonAlias("vitamin-a_100g")
    var vitaminA100g: BigDecimal,
    @JsonAlias("vitamin-b12_100g")
    var vitaminB12100g: BigDecimal,
    @JsonAlias("vitamin-b1_100g")
    var vitaminB100g: BigDecimal,
    @JsonAlias("vitamin-b2_100g")
    var vitaminB200g: BigDecimal,
    @JsonAlias("vitamin-b6_100g")
    var vitaminB6100g: BigDecimal,
    @JsonAlias("vitamin-b9_100g")
    var vitaminB9100g: BigDecimal,
    @JsonAlias("vitamin-c_100g")
    var vitaminC100g: BigDecimal,
    @JsonAlias("vitamin-d_100g")
    var vitaminD100g: BigDecimal,
    @JsonAlias("vitamin-e_100g")
    var vitaminE100g: BigDecimal,
    @JsonAlias("vitamin-pp_100g")
    var vitaminPp100g: BigDecimal,
    @JsonAlias("water_100g")
    var water100g: BigDecimal,
    @JsonAlias("zinc_100g")
    var zinc100g: BigDecimal,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffNutrimentsV3Dto(
    var carbohydrates: BigDecimal,
    @JsonAlias("carbohydrates_100g")
    var carbohydrates100g: BigDecimal,
    @JsonAlias("carbohydrates_unit")
    var carbohydratesUnit: String,
    @JsonAlias("energy-kcal")
    var energyKcal: BigDecimal,
    @JsonAlias("energy-kcal_100g")
    var energyKcal100g: BigDecimal,
    @JsonAlias("fat")
    var fat: BigDecimal,
    @JsonAlias("fat_100g")
    var fat100g: BigDecimal,
    @JsonAlias("fat_unit")
    var fatUnit: String,
    @JsonAlias("fiber")
    var fiber: BigDecimal,
    @JsonAlias("fiber_100g")
    var fiber100g: BigDecimal,
    @JsonAlias("fiber_unit")
    var fiberUnit: String,
    @JsonAlias("fruits-vegetables-legumes-estimate-from-ingredients_100g")
    var fruitsVegetablesLegumesEstimateFromIngredients100g: BigDecimal,
    @JsonAlias("fruits-vegetables-legumes-estimate-from-ingredients_serving")
    var fruitsVegetablesLegumesEstimateFromIngredientsServing: BigDecimal,
    @JsonAlias("fruits-vegetables-nuts-estimate-from-ingredients_100g")
    var fruitsVegetablesNutsEstimateFromIngredients100g: BigDecimal,
    @JsonAlias("fruits-vegetables-nuts-estimate-from-ingredients_serving")
    var fruitsVegetablesNutsEstimateFromIngredientsServing: BigDecimal,
    @JsonAlias("proteins")
    var proteins: BigDecimal,
    @JsonAlias("proteins_100g")
    var proteins100g: BigDecimal,
    @JsonAlias("proteins_unit")
    var proteinsUnit: String,
    @JsonAlias("salt")
    var salt: BigDecimal,
    @JsonAlias("salt_100g")
    var salt100g: BigDecimal,
    @JsonAlias("salt_unit")
    var saltUnit: String,
    @JsonAlias("saturated-fat")
    var saturatedFat: BigDecimal,
    @JsonAlias("saturated-fat_100g")
    var saturatedFat100g: BigDecimal,
    @JsonAlias("saturated-fat_unit")
    var saturatedFatUnit: String,
    @JsonAlias("sodium")
    var sodium: BigDecimal,
    @JsonAlias("sodium_100g")
    var sodium100g: BigDecimal,
    @JsonAlias("sodium_unit")
    var sodiumUnit: String,
    @JsonAlias("sugars")
    var sugars: BigDecimal,
    @JsonAlias("sugars_100g")
    var sugars100g: BigDecimal,
    @JsonAlias("sugars_unit")
    var sugarsUnit: String,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffIngredientsV3Dto(
    @JsonAlias("ciqual_food_code")
    var ciqualFoodCode: String? = null,
    var id: String,
    @JsonAlias("percent_estimate")
    var percentEstimate: Int,
    var vegan: String? = null,
    var vegetarian: String? = null,
    var ingredients: List<OffIngredientsV3Dto>? = listOf(),
    var text: String,
)
