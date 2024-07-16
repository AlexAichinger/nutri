package com.alexaichinger.nutritracking.service.helpers

import java.math.BigDecimal

fun plus(
    num: BigDecimal,
    number: BigDecimal?,
): BigDecimal {
    return if (number == null) num else num.plus(number)
}

fun BigDecimal.getRation(): BigDecimal {
    return this.divide(BigDecimal(100))
}