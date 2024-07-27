package com.alexaichinger.nutritracking.service.health

import com.alexaichinger.nutritracking.repository.UserPhysiologyRepository
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class PhysiologyService(
    private val userPhysiologyRepository: UserPhysiologyRepository,
) {
    fun updateUserPhysiology(
        user: String,
        physiologyDto: PhysiologyDto,
    ) {
        userPhysiologyRepository.save(physiologyDto.toEntity(user))
    }

    /**
     * Utilizes the Katch-McArdle Formula to calculate
     *  BMR = 370 + (21.6 * <Lean Body Mass (kg)>)
     */
    private fun calculateBasalMetabolicRate(leanBodyMass: BigDecimal): BigDecimal {
        val calculate = BigDecimal(21.6).multiply(leanBodyMass)
        return BigDecimal(370).multiply(calculate)
    }

    private fun calculateTotalDailyEnergyExpenditure(
        activityLevel: ActivityLevel,
        bmr: BigDecimal,
    ): BigDecimal {
        return bmr.multiply(activityLevel.multiplier())
    }
}
