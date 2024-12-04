package com.manish.sampledesignpattern

class Profile(
    var id: Int = 0,
    var name: String? = null
) : Cloneable {

    @Throws(CloneNotSupportedException::class)
    public override fun clone(): Profile {
        return super.clone() as Profile
    }
}
