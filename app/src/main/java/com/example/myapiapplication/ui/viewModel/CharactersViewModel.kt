package com.example.myapiapplication.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapiapplication.data.model.CharactersResponseModel
import com.example.myapiapplication.data.model.Results
import com.example.myapiapplication.domain.SearchCharactersUseCase
import kotlinx.coroutines.launch

class CharactersViewModel : ViewModel(){
    var charactersList = listOf<Results>()

    var charactersResponseModel = MutableLiveData<CharactersResponseModel?>()

    var searchCharactersUseCase = SearchCharactersUseCase()


    fun onCreate() {

        viewModelScope.launch {
            val result = searchCharactersUseCase()
            if (result != null) {
                charactersList = result.results
                charactersResponseModel.postValue(result)
            }
        }
    }
}