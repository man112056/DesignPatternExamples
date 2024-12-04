package com.manish.sampledesignpattern

class ValidatorChain(private val validators: List<Validator>)  {

    fun validate(input: String): ValidationResult {
        for (validator in validators) {
            val result = validator.validate(input)
            if (!result.isValid) {
                return result // If validation fails, return immediately
            }
        }
        return ValidationResult(true, "") // All validators passed
    }
}