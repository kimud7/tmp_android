package com.example.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login.Intro.IntroCard
import com.example.login.Intro.IntroCardAdapter
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_intro.*
import kotlinx.android.synthetic.main.item_container.*
import kotlinx.android.synthetic.main.item_container.view.*

class IntroActivity:AppCompatActivity(){
    val IntroCardList : List<IntroCard> = listOf(
            IntroCard("테스트입니다","이것은 테스트입니다","https://cdn.pixabay.com/photo/2015/09/09/17/38/basil-932079_960_720.jpg") ,
            IntroCard("테스트입니다2","이것은 테스트입니다2","https://cdn.pixabay.com/photo/2015/09/09/17/38/basil-932079_960_720.jpg"),
            IntroCard("테스트입니다3","이것은 테스트입니다3","https://cdn.pixabay.com/photo/2015/09/09/17/38/basil-932079_960_720.jpg")

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        val adapter = IntroCardAdapter(IntroCardList)
        viewpager.adapter = adapter
        Btn_intro_next.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}