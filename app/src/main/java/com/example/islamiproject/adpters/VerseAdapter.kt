package com.example.islamiproject.adpters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.islamiproject.R

class VerseAdapter:RecyclerView.Adapter<VerseAdapter.ViewHolder>() {
    var items : List<String>? = null
    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
            val verseContent :TextView = itemView.findViewById(R.id.verse_tv_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val view = LayoutInflater.from(parent.context)
             .inflate(R.layout.sura_verse_item,parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return items?.size ?: 0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val content:String? = items?.get(position)
        holder.verseContent.setText(content)
    }
    fun changeData(verses:List<String>){
        this.items = verses
        notifyDataSetChanged()
    }

}