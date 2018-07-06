package com.example.demo.viewmodeldemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.frameLayout, FragmentOne()).addToBackStack(null).commit()
        supportFragmentManager.beginTransaction().add(R.id.frameLayout2, FragmentTwo()).addToBackStack(null).commit()
    }
}

