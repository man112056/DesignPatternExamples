package com.manish.sampledesignpattern.factory

import com.manish.sampledesignpattern.validator.AdminErrorFormatter
import com.manish.sampledesignpattern.validator.AdminInputValidator
import com.manish.sampledesignpattern.validator.ErrorFormatter
import com.manish.sampledesignpattern.validator.InputValidator

class AdminValidationFactory : ValidationFactory {
    override fun createValidator(): InputValidator = AdminInputValidator()
    override fun createErrorFormatter(): ErrorFormatter = AdminErrorFormatter()
}