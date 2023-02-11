package com.example.myapiapplication.data.network

import junit.framework.Assert.assertNotNull
import kotlinx.coroutines.test.runTest
import org.junit.Test

internal class CharacterServiceTest {

    @Test
    fun searchCharacters() = runTest {
        val service = CharacterService()
        val response = service.searchCharacters()
        assertNotNull(response)
    }
}