package com.example.usuplace

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class itemPlaceAdapter (private val item: List<item>): RecyclerView.Adapter<itemPlaceViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemPlaceViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        return itemPlaceViewHolder(view)

    }

    override fun onBindViewHolder(holder: itemPlaceViewHolder, position: Int) {
        holder.render(item[position])
    }

    override fun getItemCount() = item.size
}