package com.altyyev.shoplist.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.altyyev.shoplist.R
import com.altyyev.shoplist.databinding.ActivityMainBinding
import com.altyyev.shoplist.ui.activity.NewNoteActivity
import com.altyyev.shoplist.ui.fragment.NoteFragment
import com.altyyev.shoplist.utils.FragmentManager
import dagger.hilt.android.AndroidEntryPoint

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

                }
                R.id.note -> {
                    FragmentManager.setFragment(NoteFragment.newInstance(), this@MainActivity)
                }
            }
            true
        }
        floatingActionBar.setOnClickListener {
            startActivity(Intent(this@MainActivity, NewNoteActivity::class.java))
        }
    }

}