package com.example.islamiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.islamiproject.ui.HadethFragment
import com.example.islamiproject.ui.QuranFragment
import com.example.islamiproject.ui.RadioFragment
import com.example.islamiproject.ui.SebhaFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNavBar:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavBar = findViewById(R.id.navigation_bar_main)
        bottomNavBar.setOnItemSelectedListener {
          if(bottomNavBar.selectedItemId == R.id.home_nav_hadeth){
               pushFragment(HadethFragment())
          }
            if(bottomNavBar.selectedItemId == R.id.home_nav_quran){
                pushFragment(QuranFragment())
            }
            if(bottomNavBar.selectedItemId == R.id.home_nav_sebha){
                pushFragment(SebhaFragment())
            }
            if(bottomNavBar.selectedItemId == R.id.home_nav_radio){
                pushFragment(RadioFragment())
            }

            return@setOnItemSelectedListener true
        }
        bottomNavBar.selectedItemId = R.id.home_nav_quran
    }
    fun pushFragment(fragment:Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,fragment).commit()
    }
}