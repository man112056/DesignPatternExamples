package com.manish.sampledesignpattern.factory

import com.manish.sampledesignpattern.validator.ErrorFormatter
import com.manish.sampledesignpattern.validator.InputValidator
import com.manish.sampledesignpattern.validator.UserErrorFormatter
import com.manish.sampledesignpattern.validator.UserInputValidator

class UserValidationFactory : ValidationFactory {
    override fun createValidator(): InputValidator = UserInputValidator()
    override fun createErrorFormatter(): ErrorFormatter = UserErrorFormatter()
}