package com.example.registrationchallengeapp

import java.io.Serializable

data class RegistrationData(
    var title: String,
    var firstName: String,
    var lastName: String,
    var email: String,
    var phone:String,
    var password:String
):Serializable