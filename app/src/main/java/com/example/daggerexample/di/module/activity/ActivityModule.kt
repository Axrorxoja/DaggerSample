package com.example.daggerexample.di.module.activity

import com.example.daggerexample.domain.ActivityObject
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {
    @Provides
    fun provideActivityObject() = ActivityObject()
}