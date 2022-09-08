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
import com.example.ebay_k_1.model.Free_shipping

class Free_ShippingAdapter(var context: Context, var items1:ArrayList<Free_shipping>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int {
       return items1.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.free_shipping, parent, false)
        return Free_shippingHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val items1 = items1[position]

        if (holder is Free_shippingHolder){
            var text1 = holder.text1
            var text2 = holder.text2
            var text3 = holder.text3
            var text4 = holder.text4
            var image_free = holder.image_free

            image_free.setImageResource(items1.image_free)
            text1.text = items1.text1
            text2.text = items1.text2
            text3.text = items1.text3
            text4.text = items1.text4

            text3.setPaintFlags(text3.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)
        }
    }

    class Free_shippingHolder(view: View): RecyclerView.ViewHolder(view){
        var image_free: ImageView
        var text1: TextView
        var text2: TextView
        var text3: TextView
        var text4: TextView

        init {
            image_free = view.findViewById(R.id.free_image_tv)
            text1 = view.findViewById(R.id.text1)
            text2 = view.findViewById(R.id.text2)
            text3 = view.findViewById(R.id.text3)
            text4 = view.findViewById(R.id.text4)
        }
    }

}