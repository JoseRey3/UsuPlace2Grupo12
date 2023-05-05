package com.example.usuplace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
/*import androidx.appcompat.widget.SearchView*/
import com.example.usuplace.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGo.setOnClickListener()
        {
            startActivity(Intent(baseContext, MainSearchSite::class.java))
        }
        /*initUI()*/
    }

    /*private fun initUI() {
        binding.searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener
        {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchByName(query.orEmpty())
                return false
            }

            override fun onQueryTextChange(newText: String?)= false
        })
    }

    private fun searchByName(query: String) {

    }*/
}