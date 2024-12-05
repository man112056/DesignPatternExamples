package com.manish.sampledesignpattern.validator

class AdminInputValidator : InputValidator {
    override fun validate(input: String): Boolean {
        return input.isNotEmpty() && input.length > 5 // Example rule: Minimum 5 characters
    }
}