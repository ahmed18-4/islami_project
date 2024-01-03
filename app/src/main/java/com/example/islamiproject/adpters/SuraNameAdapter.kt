package com.example.islamiproject.adpters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islamiproject.R

class SuraNameAdapter(val itmes:List<String>):RecyclerView.Adapter<SuraNameAdapter.ViewHolder>() {
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
       val chaName:TextView= itemView.findViewById(R.id.chapter_name_tv_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cahpter_name_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return itmes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val suraName = itmes[position]
        holder.chaName.setText(suraName)
        if (onItemClickListener!=null){
            holder.itemView.setOnClickListener {
                onItemClickListener?.onItemClick(position,suraName)
            }
        }
   }
    var onItemClickListener :OnItemClickListener? = null
    interface OnItemClickListener{
        fun onItemClick(postion:Int,name:String)
    }
}