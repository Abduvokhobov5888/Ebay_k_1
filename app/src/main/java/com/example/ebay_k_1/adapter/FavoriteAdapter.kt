package com.example.ebay_k_1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay_k_1.R
import com.example.ebay_k_1.model.Favorite

class FavoriteAdapter(var context: Context, var items:ArrayList<Favorite>): RecyclerView.Adapter<RecyclerView.ViewHolder> {
    override fun getItemCount(): Int {
       return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.favorite, parent, false)
        return
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}