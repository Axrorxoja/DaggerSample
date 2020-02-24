package com.example.daggerexample.di.component

import com.example.daggerexample.App
import com.example.daggerexample.di.module.activity.NetModule
import com.example.daggerexample.di.module.app.ActivityModule
import com.example.daggerexample.di.module.app.AppModule
import com.example.daggerexample.di.scope.AppScope
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@AppScope
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityModule::class,
        NetModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {
    @Component.Factory
    interface Factory : AndroidInjector.Factory<App>
}
