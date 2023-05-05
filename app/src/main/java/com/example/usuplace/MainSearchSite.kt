package com.example.usuplace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainSearchSite : AppCompatActivity() {

    private val categories = listOf(
        category.parque,
        category.cerros,
        category.montañas,
        category.piscina
    )

    private val litem = listOf(
        item.siteone,
        item.sitetwo,
        item.sitethree,
        item.sitefour
    )

    private lateinit var populares: RecyclerView
    private lateinit var placeAdapter: categoryAdapter

    private lateinit var itemRV: RecyclerView
    private lateinit var itemPlaceAdapter: itemPlaceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_search_site)
        initComponent()
        initUI()
    }

    private fun initComponent() {
        populares = findViewById(R.id.populares)
        itemRV = findViewById(R.id.itemRV)
    }

    private fun initUI() {
        placeAdapter = categoryAdapter(categories)
        populares.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        populares.adapter = placeAdapter

        itemPlaceAdapter = itemPlaceAdapter(litem)
        itemRV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        itemRV.adapter = itemPlaceAdapter
    }
}
