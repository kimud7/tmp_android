package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.login.Login_fragment.Fragment_signin_input
import com.example.login.Login_fragment.Fragment_signin_select
import com.example.login.Login_fragment.Fragment_signup
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setFrag(0);
        img_signup_orangebar.visibility = View.INVISIBLE;

        Btn_Signin.setOnClickListener {
            setFrag(0);
            img_signup_orangebar.visibility = View.INVISIBLE;
            img_signin_orangebar.visibility = View.VISIBLE;
        }
        Btn_signup.setOnClickListener {
            setFrag(1)
            img_signin_orangebar.visibility = View.INVISIBLE;
            img_signup_orangebar.visibility = View.VISIBLE;
        }
    }
    fun setFrag(frgNum:Int){
        val ft = supportFragmentManager.beginTransaction()
        when(frgNum){
            0->{ft.replace(R.id.mainFrame,Fragment_signin_select()).commit() }
            1->{ft.replace(R.id.mainFrame,Fragment_signup()).commit()}
            2->{ft.replace(R.id.mainFrame,Fragment_signin_input()).commit()}
        }
    }
}