package com.example.islamiproject.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islamiproject.R
import com.example.islamiproject.adpters.SuraNameAdapter
import com.example.islamiproject.constants.const


class HadethFragment : Fragment() {


lateinit var hadethRc :RecyclerView
lateinit var adapter: SuraNameAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_hadeth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadHadeth()
        hadethRc = view.findViewById(R.id.hadeth_name_rec)
        adapter = SuraNameAdapter(hadethList)
        hadethRc.adapter = adapter
      adapter.onItemClickListener = object :SuraNameAdapter.OnItemClickListener{
            override fun onItemClick(postion: Int, name: String) {
                 openHadeth(postion)
            }
        }
    }
    lateinit var hadethList: MutableList<String>
     fun loadHadeth() {
         hadethList= mutableListOf()
         for (i in 0..49){

             hadethList.add(i,"   الحديث رقم${i+1}")
         }
    }
     fun openHadeth(pos:Int){
       var hadethPos = pos
         var intent = Intent(context,HadethDetailsActivity::class.java)
         intent.putExtra(const.Hdeth_Postion,hadethPos)
         startActivity(intent)
     }

}