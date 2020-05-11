package com.example.counts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListItemAdapter(): RecyclerView.Adapter<ListHolder>(){

    val data = listOf(ItemModel("Clotrimazole", 23), ItemModel("Dexamethasone", 12))

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_list, parent, false)
        return ListHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        val item = data[position]
        holder.itemName.text = item.name.toString()
        holder.itemNumber.text = item.number.toString()
    }

}

class ListHolder(v: View):RecyclerView.ViewHolder(v){
    val itemName: TextView = v.findViewById(R.id.item_name)
    val itemNumber: TextView = v.findViewById(R.id.item_number)

}