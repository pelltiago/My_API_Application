package com.example.myapiapplication.domain

import com.example.myapiapplication.data.CharactersRepository


class SearchCharactersUseCase {
        private val repository = CharactersRepository()
        suspend operator fun invoke() = repository.searchCharacters()
    }
