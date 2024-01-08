package com.example.islamiproject.ui

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.islamiproject.R
import com.example.islamiproject.constants.const
import com.example.islamiproject.databinding.ActivityHadethDetailsBinding

class HadethDetailsActivity : AppCompatActivity() {

lateinit var hadethTitle :TextView
lateinit var hadethContent :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hadeth_details)
        var pos = intent.getIntExtra(const.Hdeth_Postion,-1)
        hadethTitle = findViewById(R.id.hadeth_title)
        hadethContent = findViewById(R.id.hadeth_content_tv)
        setHadethTitle(pos)
        setHadethContent(pos)

    }
    fun setHadethContent(pos: Int) {
        var fileName = "h${pos+1}.txt"
        val content =assets.open(fileName).bufferedReader().use {
        it.readText()
        }

        hadethContent.setText(content)
    }

    fun setHadethTitle(pos: Int) {
        var fileName = "h${pos+1}.txt"
        val title =assets.open(fileName).bufferedReader().readLine()
        hadethTitle.setText(title)
    }

}