package com.manish.sampledesignpattern.validator

interface InputValidator {
    fun validate(input: String): Boolean
}

interface ErrorFormatter {
    fun formatError(input: String): String
}