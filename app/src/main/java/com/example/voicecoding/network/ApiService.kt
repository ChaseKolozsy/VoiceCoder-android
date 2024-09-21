package com.example.voicecoding.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://your_backend_url/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: ApiEndpoints = retrofit.create(ApiEndpoints::class.java)
}