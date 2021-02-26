package com.josephdbx.contacts.model

class Contact constructor(
    name: String,
    surname: String,
    enterprise: String,
    age: Int,
    weight: Float,
    address: String,
    phone: String,
    email: String,
    photo: Int
) {
    var name: String = ""
    var surname: String = ""
    var enterprise: String = ""
    var age: Int = 0
    var weight: Float = 0.0f
    var address: String = ""
    var phone: String = ""
    var email: String = ""
    var photo: Int = 0

    init {
        this.name = name
        this.surname = surname
        this.enterprise = enterprise
        this.age = age
        this.weight = weight
        this.address = address
        this.phone = phone
        this.email = email
        this.photo = photo
    }
}