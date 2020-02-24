package com.example.daggerexample

import android.app.Application
import com.example.daggerexample.di.component.AppComponent
import com.example.daggerexample.di.component.DaggerAppComponent
import com.example.daggerexample.di.module.activity.ActivityModule
import com.example.daggerexample.di.module.fragment.fragment1.Fragment1Module
import com.example.daggerexample.di.module.fragment.fragment2.Fragment2Module
import com.example.daggerexample.di.module.fragment.fragment3.Fragment3Module

class App : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent
            .builder()
            .activityModule(ActivityModule())
            .fragment1Module(Fragment1Module())
            .fragment2Module(Fragment2Module())
            .fragment3Module(Fragment3Module())
            .build()
    }
}