package com.example.myapiapplication.data.network


import com.example.myapiapplication.core.RetrofitHelper
import com.example.myapiapplication.data.model.CharactersResponseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CharacterService {

    private val retrofit = RetrofitHelper.getRetrofit()


    suspend fun searchCharacters(): CharactersResponseModel? {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(CharacterApiClient::class.java).searchCharacters()
            response.body()
        }
    }
}