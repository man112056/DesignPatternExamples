package com.manish.sampledesignpattern.validator

// Validators for Regular Users
class UserInputValidator : InputValidator {
    override fun validate(input: String): Boolean {
        return input.isNotEmpty() && input.all { it.isLetterOrDigit() } // Example rule: No special chars
    }
}