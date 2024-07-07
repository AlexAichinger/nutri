package com.alexaichinger.nutri_tracking.web

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class Health {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    @GetMapping("/health")
    @ResponseStatus(HttpStatus.OK)
    fun health() {
        log.info("09876567893129029302190312909312==-------------------------")
    }
}