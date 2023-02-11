package com.example.myapiapplication.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapiapplication.R
import com.example.myapiapplication.data.model.CharactersResponseModel
import com.example.myapiapplication.databinding.ActivityMainBinding
import com.example.myapiapplication.ui.viewModel.CharactersViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val charactersViewModel: CharactersViewModel by viewModels()
        charactersViewModel.onCreate()
        charactersViewModel.charactersResponseModel.observe(this) {
            if (it != null) {
                setupRecyclerView(recyclerView, it)
            }
        }
    }
}

private fun setupRecyclerView(
    recyclerView: RecyclerView,
    charactersResponseModel: CharactersResponseModel
) {
    recyclerView.adapter =
        CharactersViewAdapter(charactersResponseModel.results)
}
