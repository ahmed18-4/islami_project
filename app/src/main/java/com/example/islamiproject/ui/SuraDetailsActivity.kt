package com.example.islamiproject.ui

import android.os.Bundle
import android.util.Log
import android.widget.Adapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.islamiproject.R
import com.example.islamiproject.adpters.VerseAdapter
import com.example.islamiproject.constants.const


class SuraDetailsActivity : AppCompatActivity() {


lateinit var suraNameTv:TextView
lateinit var versesRv:RecyclerView
lateinit var adapter: VerseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           setContentView(R.layout.activity_sura_details)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        suraNameTv = findViewById(R.id.sura_name_tv_details)
        initRV()
        var name :String = intent.getStringExtra(const.Extra_Sura_Name) as String
        var pos: Int = intent.getIntExtra(const.Extra_Sura_Postion,-1)
        suraNameTv.setText(name)
        readSuraFile(pos)

        }

     fun initRV() {
       versesRv = findViewById(R.id.sura_details_rv)
        adapter= VerseAdapter()
        versesRv.adapter = adapter
    }

    fun readSuraFile(postion: Int) {
        Log.e("","$postion")
         var fileName = "${postion+1}.txt"
         val fileContent = assets.open(fileName).bufferedReader().use { it.readText() }
         val verses :List<String> = fileContent.split("\n")
        adapter.changeData(verses)

    }
}

