package com.example.usuplace

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class itemPlaceViewHolder (view: View) : RecyclerView.ViewHolder(view){
    private val name_place: TextView = view.findViewById(R.id.name_place)
    private val image_place: ImageView = view.findViewById(R.id.image_place)

    fun render(itemPlace: item) {
        when (itemPlace){
            com.example.usuplace.item.siteone -> {
                name_place.text= "Cerros"
                image_place.setImageDrawable(
                    ContextCompat.getDrawable(image_place.context, R.drawable.pic1)
                )
            }
            com.example.usuplace.item.sitetwo -> {
                name_place.text= "Montañas"
                image_place.setImageDrawable(
                    ContextCompat.getDrawable(image_place.context, R.drawable.pic2)
                )
            }
            com.example.usuplace.item.sitethree -> {
                name_place.text= "Paques"
                image_place.setImageDrawable(
                    ContextCompat.getDrawable(image_place.context, R.drawable.pic_new_1)
                )
            }
            com.example.usuplace.item.sitefour -> {
                name_place.text= "piscinas"
                image_place.setImageDrawable(
                    ContextCompat.getDrawable(image_place.context, R.drawable.pic_new_2)
                )
            }
        }
    }
}