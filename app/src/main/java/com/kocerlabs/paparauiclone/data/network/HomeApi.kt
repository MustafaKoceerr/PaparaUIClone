package com.kocerlabs.paparauiclone.data.network

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface HomeApi {


    @GET("user/login")
    suspend fun login( // async olarak coroutine ile çağırmak için suspend yaptım.
        @Body loginRequest: LoginRequest
    ): LoginResponse

//    val URL = "https://dummyjson.com/"
}