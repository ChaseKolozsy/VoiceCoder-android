package com.example.voicecoding.network

import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Body
import retrofit2.Call

data class SyntaxRequest(val command: String, val translation: String)

interface ApiEndpoints {
    @GET("python")
    fun getPythonSyntax(): Call<List<String>>

    @POST("python")
    fun addPythonSyntax(@Body request: SyntaxRequest): Call<Void>

    @GET("vim")
    fun getVimSyntax(): Call<List<String>>

    @POST("vim")
    fun addVimSyntax(@Body request: SyntaxRequest): Call<Void>

    @GET("pdb")
    fun getPdbSyntax(): Call<List<String>>

    @POST("pdb")
    fun addPdbSyntax(@Body request: SyntaxRequest): Call<Void>

    @GET("aider")
    fun getAiderSyntax(): Call<List<String>>

    @POST("aider")
    fun addAiderSyntax(@Body request: SyntaxRequest): Call<Void>

    @POST("start_server")
    fun startHomeServer(): Call<Void>
}