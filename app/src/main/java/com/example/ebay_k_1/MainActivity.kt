package com.example.ebay_k_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay_k_1.adapter.FavoriteAdapter
import com.example.ebay_k_1.adapter.Free_ShippingAdapter
import com.example.ebay_k_1.model.Favorite
import com.example.ebay_k_1.model.Free_shipping
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var rv1: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        free_shipping()
    }
    fun initViews(){
        recyclerView = findViewById(R.id.rv)
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.setLayoutManager(manager)

        refreshAdapter(getFavorite())
    }

    fun refreshAdapter(items: ArrayList<Favorite>){
        val adapter = FavoriteAdapter(this,items)
        recyclerView.adapter = adapter

    }

    fun getFavorite(): ArrayList<Favorite>{
        val items = ArrayList<Favorite>()

        items.add(Favorite("Apple Watch", R.drawable.watch ))
        items.add(Favorite("Apple Watch", R.drawable.watch ))
        items.add(Favorite("Apple Watch", R.drawable.watch ))
        items.add(Favorite("Apple Watch", R.drawable.watch ))
        items.add(Favorite("Apple Watch", R.drawable.watch ))
        items.add(Favorite("Apple Watch", R.drawable.watch ))
        items.add(Favorite("Apple Watch", R.drawable.watch ))
        items.add(Favorite("Apple Watch", R.drawable.watch ))
        items.add(Favorite("Apple Watch", R.drawable.watch ))
        items.add(Favorite("Apple Watch", R.drawable.watch ))

        return items
    }

    fun free_shipping(){
        rv1 = findViewById(R.id.rv1)
        val  manager1 = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv1.setLayoutManager(manager1)

        refreshAdapter1(getFreeShipping())
    }

    fun refreshAdapter1(items1: ArrayList<Free_shipping>){

        val adapter1 = Free_ShippingAdapter(this,items1)
        rv1.adapter = adapter1
    }

    fun getFreeShipping(): ArrayList<Free_shipping>{
        val items1: ArrayList<Free_shipping> = ArrayList()

        items1.add(Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch))
        items1.add(Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch))
        items1.add(Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch))
        items1.add(Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch))
        items1.add(Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch))
        items1.add(Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch))
        items1.add(Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch))
        items1.add(Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch))
        items1.add(Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch))
        items1.add(Free_shipping("Bose QuietComfort Earbuds","$199.00","$279.00","29% OFF", R.drawable.watch))


        return items1
    }

}
