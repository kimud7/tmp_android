package com.example.login.Intro

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.login.R

class IntroCardAdapter(private val itemList:List<IntroCard>): RecyclerView.Adapter<IntroCardViewHolder>() {

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroCardViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.item_container, parent, false)
        return IntroCardViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: IntroCardViewHolder, position: Int) {
        val item = itemList[position]
        holder.apply {
            bind(item)
        }

    }
}