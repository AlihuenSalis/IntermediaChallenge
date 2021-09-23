package com.intermediachallenge.ui.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.intermediachallenge.R
import com.intermediachallenge.data.model.CharacterModel
import com.intermediachallenge.ui.ViewHolder.CharacterViewHolder

class CharacterAdapter(val characterList: List<CharacterModel>):RecyclerView.Adapter<CharacterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CharacterViewHolder(layoutInflater.inflate(R.layout.item_character, parent, false))
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val item = characterList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = characterList.size
}