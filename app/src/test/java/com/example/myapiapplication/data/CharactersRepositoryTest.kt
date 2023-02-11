package com.example.myapiapplication.data

import junit.framework.Assert.assertNotNull
import kotlinx.coroutines.test.runTest
import org.junit.Test


internal class CharactersRepositoryTest {

    @Test
    fun searchCharacters() = runTest {
        val repository = CharactersRepository()
        val response = repository.searchCharacters()
        assertNotNull(response)
    }
}