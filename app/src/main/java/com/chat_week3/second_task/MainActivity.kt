package com.chat_week3.second_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val chat1:Fragment=chat1Fragment()
        val fragmentTransaction:FragmentTransaction=supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fl_fragments,chat1).commit()
    }
}