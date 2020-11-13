package com.example.login.Intro

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_container.view.*

class IntroCardViewHolder(v:View):RecyclerView.ViewHolder(v) {
    var view : View = v

    fun bind(item: IntroCard){
        view.Txt_Intro_Card_Title.text = item.title
        view.Txt_Intro_Card_Content.text = item.content
        Picasso.get().load(item.imageurl).into(view.kbv_item)
    }
}