package com.example.storytime

import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface UserService {

    @GET("user")
    fun getUser(@Query("email") email: String, @Query("password") password : String) : Call<LoginResponse>


    //@POST("user")
    //fun createAccount(): Call <UserModel>

}