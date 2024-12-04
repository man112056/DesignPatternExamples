package com.manish.sampledesignpattern

data class UserProfile(
    var id: Int,
    var name: String,
    var address: String,
    var preferences: MutableList<String>
)
