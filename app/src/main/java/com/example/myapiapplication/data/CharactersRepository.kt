package com.example.myapiapplication.data

import com.example.myapiapplication.data.model.CharactersResponseModel
import com.example.myapiapplication.data.network.CharacterService

class CharactersRepository {

    private val api = CharacterService()

    suspend fun searchCharacters(): CharactersResponseModel? {
        return api.searchCharacters()
    }

}
