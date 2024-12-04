package com.manish.sampledesignpattern.validator

import com.manish.sampledesignpattern.ValidationResult
import com.manish.sampledesignpattern.Validator

class DigitValidator : Validator {

    override fun validate(input: String): ValidationResult {
        return if (input.any { it.isDigit() }) {
            ValidationResult(true, "")
        } else {
            ValidationResult(false, "Password must contain at least one digit.")
        }
    }
}