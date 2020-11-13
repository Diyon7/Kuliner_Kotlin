package com.example.projectenam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contact_list_item.view.*

class ContactAdapter (val phoneItemList:List<KulinerData>, val clickListener: (KulinerData) ->Unit) :
RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val  inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.contact_list_item,parent,false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(phoneItemList[position], clickListener)
    }

    override fun getItemCount() = phoneItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: KulinerData, clickListener: (KulinerData) -> Unit) {
            itemView.tv_part_item_name.text = data.name
            itemView.tv_part_photo.setImageResource(data.photo)
            itemView.setOnClickListener {clickListener(data)}
        }
    }
}