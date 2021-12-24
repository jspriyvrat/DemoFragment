package com.example.demofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() ,CommuniCator{
   lateinit var  tabLayout:TabLayout
    lateinit var viewPager:ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            initView()
        val home=Home()
        supportFragmentManager.beginTransaction().replace(R.id.fragment_Container,home).commit()

        val adapter=ViewPagerAdapter(supportFragmentManager,lifecycle)
        viewPager.adapter=adapter
        TabLayoutMediator(tabLayout,viewPager){
            tab,position->
            when(position){
                0->{
                    tab.text="Home"
                }
                1->{
                    tab.text="DashBoard"
                }
        }
        }.attach()




    }

    private fun initView() {

      tabLayout=findViewById(R.id.tabLayout)
    viewPager =findViewById(R.id.myviewpager)

    }

    override fun passData(myEmail: String, myPassword: String) {
        val dataBundle=Bundle()
        dataBundle.putString("email",myEmail)
        dataBundle.putString("password",myPassword)
        val transaction=this.supportFragmentManager.beginTransaction()
        val dashboard=DashBoard()
        dashboard.arguments=dataBundle
        transaction.replace(R.id.fragment_Container,dashboard).commit()
    }
}