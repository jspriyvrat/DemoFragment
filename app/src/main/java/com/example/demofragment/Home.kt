package com.example.demofragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class Home : Fragment() {

private lateinit var communiCator: CommuniCator
private  lateinit var btn:Button
private lateinit var email :EditText
private lateinit var pass:EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      val view= inflater.inflate(R.layout.fragment_home, container, false)
        btn=view.findViewById(R.id.myBtn)
        email=view.findViewById(R.id.email_box)
        pass=view.findViewById(R.id.password_box)
        communiCator=activity as CommuniCator
        btn.setOnClickListener{
        communiCator.passData(email.text.toString(),pass.text.toString())

        }
        return view
    }


}