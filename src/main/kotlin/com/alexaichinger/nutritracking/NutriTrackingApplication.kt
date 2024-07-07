package com.alexaichinger.nutritracking

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.alexaichinger.nutritracking")
class NutriTrackingApplication

fun main(args: Array<String>) {
    runApplication<NutriTrackingApplication>(*args)
}
