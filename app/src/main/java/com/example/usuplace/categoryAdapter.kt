package com.example.usuplace

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class categoryAdapter (private val place: List<category>): RecyclerView.Adapter<categoryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): categoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return categoryViewHolder(view)

    }

    override fun onBindViewHolder(holder: categoryViewHolder, position: Int) {
        holder.render(place[position])
    }

    override fun getItemCount() = place.size
}