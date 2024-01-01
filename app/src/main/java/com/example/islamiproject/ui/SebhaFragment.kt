package com.example.islamiproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.islamiproject.R

class SebhaFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sebha, container, false)
    }
lateinit var sebahaBody:ImageView
lateinit var tasbehCounter:TextView
lateinit var eldowaa:TextView
var dowaaCounter : Int = 0
    var elDowaa:String="سبحان الله"
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sebahaBody = view.findViewById(R.id.sebha_body)
        tasbehCounter = view.findViewById(R.id.sebha_tv_counter)
        eldowaa = view.findViewById(R.id.dowaa_tv)
        tasbehCounter.setText("$dowaaCounter")
        eldowaa.setText(elDowaa)
        sebahaBody.setOnClickListener {
           dowaaCounter = dowaaCounter+1
            tasbehCounter.setText("$dowaaCounter")
            if (dowaaCounter==33){
                elDowaa ="الحمد لله"
                eldowaa.setText(elDowaa)
            }
            if (dowaaCounter==66){
                elDowaa ="الله اكبر"
                eldowaa.setText(elDowaa)
            }
            if (dowaaCounter==99){
                elDowaa = "سبحان الله"
                eldowaa.setText(elDowaa)
            dowaaCounter = 0
            }
        }
    }
}