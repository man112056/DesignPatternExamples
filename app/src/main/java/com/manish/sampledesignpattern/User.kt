package com.manish.sampledesignpattern

class User private constructor(
    val name: String?,
    val email: String?,
    val age: Int?,
    val phoneNumber: String?
) {
    // Nested Builder class
    class Builder {
        private var name: String? = null
        private var email: String? = null
        private var age: Int? = null
        private var phoneNumber: String? = null

        // Setter methods
        fun setName(name: String) = apply { this.name = name }
        fun setEmail(email: String) = apply { this.email = email }
        fun setAge(age: Int) = apply { this.age = age }
        fun setPhoneNumber(phoneNumber: String) = apply { this.phoneNumber = phoneNumber }

        // Build method to create a User instance
        fun build() = User(name, email, age, phoneNumber)
    }
}