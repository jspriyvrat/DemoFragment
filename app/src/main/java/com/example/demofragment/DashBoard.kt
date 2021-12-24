package com.example.demofragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text


class DashBoard : Fragment() {

   private  var email:String?=""
    private var password:String?=""
private lateinit var mymail:TextView
private lateinit var mypassword:TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

    var view= inflater.inflate(R.layout.fragment_dash_board, container, false)
        mymail=view.findViewById(R.id.txtEmail)
        mypassword=view.findViewById(R.id.txtPassword)
        email=arguments?.getString("email")
        password=arguments?.getString("password")
            mymail.text=email
            mypassword.text=password
        return  view
    }
}