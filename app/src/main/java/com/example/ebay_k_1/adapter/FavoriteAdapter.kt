package com.example.ebay_k_1.adapter

import android.content.Context
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay_k_1.R
import com.example.ebay_k_1.model.Favorite

class FavoriteAdapter(var context: Context, var items:ArrayList<Favorite>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
       return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.favorite, parent, false)
        return FavoriteViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val items = items[position]

        if (holder is FavoriteViewHolder){
            var title = holder.title
            var image = holder.image

            image.setImageResource(items.image)
            title.text = items.title
        }
    }

    class FavoriteViewHolder(view: View): RecyclerView.ViewHolder(view){
        var image: ImageView
        var title: TextView

        init {
            image = view.findViewById(R.id.image_tv)
            title = view.findViewById(R.id.title_tv)
        }
    }

}