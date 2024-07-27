package com.alexaichinger.nutritracking.model.physiology

import com.alexaichinger.nutritracking.service.health.ActivityLevel
import com.alexaichinger.nutritracking.service.health.Goal
import com.alexaichinger.nutritracking.service.health.Sex
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.CompoundIndex
import org.springframework.data.mongodb.core.mapping.Document
import java.math.BigDecimal

@Document("userPhysiology")
@CompoundIndex(name = "id", def = "{'id': 1}")
@CompoundIndex(name = "user", def = "{'user': 1}")
data class UserPhysiology(
    @Id
    val id: String? = null,
    var user: String,
    var weight: BigDecimal,
    var age: Int,
    val leanMass: BigDecimal,
    val bodyFatPercentage: BigDecimal,
    val sex: Sex,
    val height: BigDecimal,
    val activityLevel: ActivityLevel,
    val goal: Goal,
)
