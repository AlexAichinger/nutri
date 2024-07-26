package com.alexaichinger.nutritracking.dto.external.openfoodfacts.v3

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class OffV3Dto(
    var code: String? = null,
    var errors: List<String> = listOf(),
    var product: OffProductV3Dto,
    var result: OffResultV3Dto,
    var status: String? = null,
)

data class OffResultV3Dto(
    var id: String? = null,
    @JsonAlias("lc_name")
    var lcName: String? = null,
    var name: String? = null,
)
