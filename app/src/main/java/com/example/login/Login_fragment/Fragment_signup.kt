package com.example.login.Login_fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.login.MainActivity2
import com.example.login.R
import com.example.login.SignupActivity
import kotlinx.android.synthetic.main.activity_login.view.*
import kotlinx.android.synthetic.main.fragment_input_login.view.*
import kotlinx.android.synthetic.main.fragment_signup.view.*

class Fragment_signup:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_signup,container,false);
        view.Btn_SignUpEmail.setOnClickListener {
            val intent = Intent(getActivity(), SignupActivity::class.java)
            startActivity(intent)
        }


        return view
    }

}