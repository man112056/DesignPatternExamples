package com.manish.sampledesignpattern.validator

class UserErrorFormatter : ErrorFormatter {
    override fun formatError(input: String): String {
        return "User Error: Input can only contain letters and numbers."
    }
}