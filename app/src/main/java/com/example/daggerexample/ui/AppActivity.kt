package com.example.daggerexample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerexample.App
import com.example.daggerexample.R
import com.example.daggerexample.domain.ActivityObject
import javax.inject.Inject

class AppActivity : AppCompatActivity() {
    @Inject
    lateinit var activityObject: ActivityObject

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
