package com.alexaichinger.nutritracking.service.health

import com.alexaichinger.nutritracking.model.physiology.UserPhysiology
import java.math.BigDecimal

enum class Sex {
    MALE,
    FEMALE,
}

enum class ActivityLevel {
    // Little or no exercise
    // Mostly sitting or lying down, minimal physical activity outside of basic daily functions.
    SEDENTARY {
        override fun multiplier() = BigDecimal(1.2)
    },

    // Light exercise or sports 1-3 days/week
    // Office work with light physical activity, such as walking or occasional recreational sports.
    LIGHT_ACTIVE {
        override fun multiplier() = BigDecimal(1.375)
    },

    // Moderate exercise or sports 3-5 days/week
    // Jobs that involve a moderate amount of physical activity or a consistent workout routine.
    MODERATELY_ACTIVE {
        override fun multiplier() = BigDecimal(1.55)
    },

    // Hard exercise or sports 6-7 days a week
    // Daily intensive training, athletes in training, or jobs involving significant physical labor.
    HEAVILY_ACTIVE {
        override fun multiplier() = BigDecimal(1.725)
    },

    // Very hard exercise, physical job, or training twice a day
    // Professional athletes, those with physically demanding jobs like construction workers, or those training multiple times a day.
    SUPER_ACTIVE {
        override fun multiplier() = BigDecimal(1.9)
    }, ;

    abstract fun multiplier(): BigDecimal
}

enum class Goal {
    WEIGHT_LOSS,
    MUSCLE_GAIN,
    MAINTENANCE,
}

data class PhysiologyDto(
    val bodyFatPercentage: BigDecimal,
    val age: Int,
    val sex: Sex,
    val weight: BigDecimal,
    val height: BigDecimal,
    val activityLevel: ActivityLevel,
    val goal: Goal,
    val totalDailyEnergyExpenditure: BigDecimal? = null,
    val basalMetabolicRate: BigDecimal? = null,
)

fun PhysiologyDto.toEntity(user: String): UserPhysiology {
    return UserPhysiology(
        user = user,
        weight = weight,
        age = age,
        leanMass = weight - (bodyFatPercentage * weight),
        bodyFatPercentage = bodyFatPercentage,
        sex = sex,
        height = height,
        activityLevel = activityLevel,
        goal = goal,
    )
}
