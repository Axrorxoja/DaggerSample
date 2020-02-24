package com.example.daggerexample.di.module.app

import com.example.daggerexample.di.subcomponent.AppActivitySubComponent
import com.example.daggerexample.ui.AppActivity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(
    subcomponents = [AppActivitySubComponent::class]
)
interface ActivityModule {
    @Binds
    @IntoMap
    @ClassKey(AppActivity::class)
    fun bindActivity(builder: AppActivitySubComponent.Factory): AndroidInjector.Factory<*>
}
