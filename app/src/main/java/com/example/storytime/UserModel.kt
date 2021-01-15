package com.example.storytime

import com.google.gson.annotations.SerializedName

class UserModel {

    @SerializedName("fullName")
    var fullName : String = ""

    @SerializedName("bornDate")
    var userBirthday : Int = 0

    @SerializedName("email")
    var email : String = ""

    @SerializedName("password")
    var password : String = ""

}