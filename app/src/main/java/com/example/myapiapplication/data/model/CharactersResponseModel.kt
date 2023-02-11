package com.example.myapiapplication.data.model

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

data class CharactersResponseModel(
    @SerializedName("info") var info: Info? = Info(),
    @SerializedName("results") var results: ArrayList<Results> = arrayListOf()
)