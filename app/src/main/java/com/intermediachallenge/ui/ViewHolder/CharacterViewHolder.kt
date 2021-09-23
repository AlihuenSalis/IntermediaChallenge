package com.intermediachallenge.ui.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.intermediachallenge.data.model.CharacterModel
import com.intermediachallenge.databinding.ItemCharacterBinding
import com.squareup.picasso.Picasso

class CharacterViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemCharacterBinding.bind(view)

    fun bind(character: CharacterModel){
        Picasso.get().load(character.thumbnail.path).into(binding.imgCharacter)
        binding.txtCharacterName.text = character.name
    }
}
