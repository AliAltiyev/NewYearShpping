package com.altyyev.shoplist.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.altyyev.shoplist.R
import com.altyyev.shoplist.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setViews()
    }

    private fun setViews() = with(binding) {
        bottomNavBar.background = null
        bottomNavBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.premium -> {
                    Log.d("log", "add selected")
                }
                R.id.list -> {
                    Log.d("log", "add selected")
                }
                R.id.settings -> {
                    Log.d("log", "add selected")
                }
                R.id.note -> {
                    Log.d("log", "add selected")
                }
            }
            true
        }
    }

}