package com.manish.sampledesignpattern.validator

import com.manish.sampledesignpattern.ValidationResult
import com.manish.sampledesignpattern.Validator

class LengthValidator : Validator {
    override fun validate(input: String): ValidationResult {
        return if (input.length >= 8) {
            ValidationResult(true, "")
        } else {
            ValidationResult(false, "Password must be at least 8 characters long.")
        }
    }
}