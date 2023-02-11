package com.example.myapiapplication.domain

import junit.framework.Assert.assertNotNull
import kotlinx.coroutines.test.runTest
import org.junit.Test

internal class SearchCharactersUseCaseTest {

    @Test
    fun searchCharacters() = runTest{
        val useCase = SearchCharactersUseCase()
        val response = useCase.invoke()
        assertNotNull(response)
    }
}