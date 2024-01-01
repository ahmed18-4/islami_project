package com.example.islamiproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplachScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splach_screen)
        Handler(Looper.getMainLooper())
            .postDelayed({
                startHomeAct()
            },2000)
    }
    fun startHomeAct(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}