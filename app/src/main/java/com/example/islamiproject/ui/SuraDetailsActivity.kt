package com.example.islamiproject.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.islamiproject.R
import com.example.islamiproject.constants.const


class SuraDetailsActivity : AppCompatActivity() {


lateinit var suraNameTv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           setContentView(R.layout.activity_sura_details)
            suraNameTv = findViewById(R.id.sura_name_tv_details)
        var name :String = intent.getStringExtra(const.Extra_Sura_Name) as String
        var pos: Int = intent.getIntExtra(const.Extra_Sura_Postion,-1)
        suraNameTv.setText(name)
        }
    }

