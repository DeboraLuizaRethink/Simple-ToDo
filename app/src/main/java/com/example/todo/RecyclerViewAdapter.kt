package com.example.todo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val item: List<String>):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolderAll>() {

    class ViewHolderAll(view: View):RecyclerView.ViewHolder(view){
        val itemCategory: TextView = view.findViewById(R.id.txt_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderAll {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
        return ViewHolderAll(view)
    }

    override fun onBindViewHolder(holder: ViewHolderAll, position: Int) {
        holder.itemCategory.text = item[position]
    }

    override fun getItemCount(): Int {
        return item.size

    }

}