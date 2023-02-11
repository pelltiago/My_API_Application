package com.example.myapiapplication.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapiapplication.R
import com.example.myapiapplication.data.model.Results
import com.example.myapiapplication.databinding.ActivityMainBinding
import com.example.myapiapplication.databinding.ListContentBinding

class CharactersViewAdapter(private val values: List<Results>) :
        RecyclerView.Adapter<CharactersViewAdapter.ViewHolder>() {
    private lateinit var binding: ListContentBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_content, parent, false)
        binding = ListContentBinding.bind(view)

        return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val characterResult = values[position]

            holder.characterImageView.let {
                Glide.with(holder.itemView.context)
                    .load(characterResult.image)
                    .into(it)
            }

            binding.characterNameTextView.text = characterResult.name
            binding.characterDescriptionTextView.text = characterResult.species
            binding.characterWorldTextView.text = characterResult.location?.name ?: "Unknown"

        }

        override fun getItemCount() = values.size

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val characterImageView: ImageView = view.findViewById(R.id.characterImageView)
        }
    }
