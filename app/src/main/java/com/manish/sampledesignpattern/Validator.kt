package com.manish.sampledesignpattern

interface Validator {
    fun validate(input: String): ValidationResult
}

data class ValidationResult(
    val isValid: Boolean,
    val errorMessagae: String
)