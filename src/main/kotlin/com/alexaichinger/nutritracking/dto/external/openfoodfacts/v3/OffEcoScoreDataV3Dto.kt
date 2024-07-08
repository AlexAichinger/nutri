package com.alexaichinger.nutritracking.dto.external.openfoodfacts.v3

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffEcoScoreDataV3Dto(
    var adjustments: OffAdjustmentsV3Dto,
//    var threatenedSpecies: ThreatenedSpecies,
    var agribalyse: OffAgribalyseV3Dto,
    var grade: String,
    var grades: Map<String, String>,
    var score: Int,
    var scores: Map<String, String>,
    var status: String,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffAgribalyseV3Dto(
    @JsonAlias("co2_total")
    val co2Total: Double,
    @JsonAlias("co2_agriculture")
    val co2Agriculture: Double,
    @JsonAlias("co2_consumption")
    val co2Consumption: Double,
    @JsonAlias("co2_distribution")
    val co2Distribution: Double,
    @JsonAlias("co2_packaging")
    val co2Packaging: Double,
    @JsonAlias("co2_transportation")
    val co2Transportation: Double,
    @JsonAlias("co2_processing")
    val co2Processing: Double,
    val score: Int,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffPackagingV3Dto(
    val score: Int,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffAdjustmentsV3Dto(
    @JsonAlias("origins_of_ingredients")
    var originsOfIngredients: OffOriginsOfIngredientsV3Dto,
    var packaging: OffPackagingV3Dto,
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffOriginsOfIngredientsV3Dto(
    var epiScore: Int,
    var warning: String,
)
