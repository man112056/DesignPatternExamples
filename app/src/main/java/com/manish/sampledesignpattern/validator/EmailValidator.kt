package com.manish.sampledesignpattern.validator

import com.manish.sampledesignpattern.ValidationResult
import com.manish.sampledesignpattern.Validator

class EmailValidator: Validator {
    override fun validate(input: String): ValidationResult {
        return if (input.any { !it.isLetterOrDigit() }) {
            ValidationResult(true, "")
        } else {
            ValidationResult(false, "Password must contain at least one special character.")
        }
    }
}