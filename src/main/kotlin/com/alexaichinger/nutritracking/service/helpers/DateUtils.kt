package com.alexaichinger.nutritracking.service.helpers

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.OffsetTime
import java.time.ZoneOffset

fun atStartOfDay(date: LocalDate): LocalDateTime {
    val noon = date.atTime(OffsetTime.of(LocalTime.NOON, ZoneOffset.UTC)).toLocalDateTime()
    return noon.with(LocalTime.MIN)
}

fun atEndOfDay(date: LocalDate): LocalDateTime {
    val noon = date.atTime(OffsetTime.of(LocalTime.NOON, ZoneOffset.UTC)).toLocalDateTime()
    return noon.with(LocalTime.MAX)
}
