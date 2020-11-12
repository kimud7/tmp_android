package com.example.login.Intro

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_container.view.*

class IntroCardViewHolder(v:View):RecyclerView.ViewHolder(v) {
    var view : View = v

    fun bind(item: IntroCard){
        view.Txt_Intro_Card_Title.text = item.title
        view.Txt_Intro_Card_Content.text = item.content
    }
}