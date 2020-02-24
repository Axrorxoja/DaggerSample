package com.example.daggerexample.ui

import com.example.daggerexample.R
import com.example.daggerexample.domain.ActivityObject
import com.example.daggerexample.ui.global.BaseDaggerActivity
import javax.inject.Inject

class AppActivity : BaseDaggerActivity() {
    @Inject
    lateinit var activityObject: ActivityObject

    override val layoutId = R.layout.activity_main
}
