package com.example.daggerexample.di.subcomponent

import com.example.daggerexample.di.module.activity.ActivityModule
import com.example.daggerexample.di.module.activity.FragmentModule
import com.example.daggerexample.di.scope.ActivityScope
import com.example.daggerexample.ui.AppActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@ActivityScope
@Subcomponent(modules = [FragmentModule::class, ActivityModule::class])
interface AppActivitySubComponent : AndroidInjector<AppActivity> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<AppActivity>
}
