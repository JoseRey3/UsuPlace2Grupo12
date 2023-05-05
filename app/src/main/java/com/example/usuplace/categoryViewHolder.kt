package com.example.usuplace

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class categoryViewHolder (view: View) : RecyclerView.ViewHolder(view){

    private val tvCategoryName:TextView = view.findViewById(R.id.tvCategoryName)
    private val imagenCat:ImageView = view.findViewById(R.id.imagenCat)

    fun render(placeCategory: category) {
        when (placeCategory){
            com.example.usuplace.category.cerros -> {
                tvCategoryName.text= "Cerros"
                imagenCat.setImageDrawable(
                    ContextCompat.getDrawable(imagenCat.context, R.drawable.cat_1)
                )
            }
            com.example.usuplace.category.montañas -> {
                tvCategoryName.text= "Montañas"
                imagenCat.setImageDrawable(
                    ContextCompat.getDrawable(imagenCat.context, R.drawable.cat_2)
                )
            }
            com.example.usuplace.category.parque -> {
                tvCategoryName.text= "Paques"
                imagenCat.setImageDrawable(
                    ContextCompat.getDrawable(imagenCat.context, R.drawable.cat_3)
                )
            }
            com.example.usuplace.category.piscina -> {
                tvCategoryName.text= "piscinas"
                imagenCat.setImageDrawable(
                    ContextCompat.getDrawable(imagenCat.context, R.drawable.cat_4)
                )
            }
        }
    }
}