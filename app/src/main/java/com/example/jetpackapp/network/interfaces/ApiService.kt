package com.example.jetpackapp.network.interfaces

import com.example.jetpackapp.network.helpers.RestConfig
import com.example.jetpackapp.network.models.Message
import retrofit2.http.GET
import retrofit2.http.Headers

interface ApiService {
    @Headers(
        "Content-Type: application/json",
        "Authorization: Token ${RestConfig.API_TOKEN}"
    )
    @GET(RestConfig.TEST_END)
    suspend fun getTestMessage(): Message
}