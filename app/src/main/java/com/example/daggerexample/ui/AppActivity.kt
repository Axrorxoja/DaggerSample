package com.example.daggerexample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerexample.R
import kotlinx.android.synthetic.main.activity_main.*

class AppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }
}
