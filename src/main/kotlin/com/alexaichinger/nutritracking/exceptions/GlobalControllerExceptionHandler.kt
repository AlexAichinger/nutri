package com.alexaichinger.nutritracking.exceptions

import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
internal class GlobalControllerExceptionHandler {
    @ExceptionHandler(ProductNotFoundException::class)
    fun handleProductNotFound(request: HttpServletRequest, e: Exception): ResponseEntity<String> {
        return ResponseEntity("There was an issue finding this product, it may need to be manually added first.", HttpStatus.NOT_FOUND)
    }

    /**
     * Handle all default errors to hide them externally
     */
    @ExceptionHandler(Exception::class)
    fun handleDefaultException(request: HttpServletRequest, e: Exception): ResponseEntity<String> {
        return ResponseEntity("It looks like we had an issue, please reach out to get this fixed.", HttpStatus.INTERNAL_SERVER_ERROR)
    }
}
