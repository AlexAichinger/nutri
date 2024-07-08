package com.alexaichinger.nutritracking.dto.external.open.food.facts.v3

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffV3Dto(
    var code: String,
    var errors: List<String>,
    var product: OffProductV3Dto,
    var result: OffResultV3Dto,
    var status: String
)

data class OffResultV3Dto(
    var id: String,
    @JsonAlias("lc_name")
    var lcName: String,
    var name: String
)