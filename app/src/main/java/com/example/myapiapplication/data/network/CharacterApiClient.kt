package com.example.myapiapplication.data.network

import com.example.myapiapplication.data.model.CharactersResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface CharacterApiClient {
    @GET("character/")
    suspend fun searchCharacters(): Response<CharactersResponseModel>
}