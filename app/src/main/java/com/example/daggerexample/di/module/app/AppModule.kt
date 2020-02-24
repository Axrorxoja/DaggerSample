package com.example.daggerexample.di.module.app

import android.content.Context
import com.example.daggerexample.App
import com.example.daggerexample.di.scope.AppScope
import com.example.daggerexample.domain.AppObject
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @AppScope
    @Provides
    fun provideContext(application: App): Context {
        return application.applicationContext
    }

    @AppScope
    @Provides
    fun provideAppObject() = AppObject()
}