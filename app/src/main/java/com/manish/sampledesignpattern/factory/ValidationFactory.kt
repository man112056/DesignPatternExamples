package com.manish.sampledesignpattern.factory

import com.manish.sampledesignpattern.validator.ErrorFormatter
import com.manish.sampledesignpattern.validator.InputValidator

interface ValidationFactory {
    fun createValidator(): InputValidator
    fun createErrorFormatter(): ErrorFormatter
}