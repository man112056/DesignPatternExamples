package com.manish.sampledesignpattern.validator

class AdminErrorFormatter : ErrorFormatter {
    override fun formatError(input: String): String {
        return "Admin Error: Input must be at least 5 characters."
    }
}