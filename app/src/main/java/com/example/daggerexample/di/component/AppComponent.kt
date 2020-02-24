package com.example.daggerexample.di.component

import com.example.daggerexample.di.module.activity.ActivityModule
import com.example.daggerexample.di.module.activity.NetModule
import com.example.daggerexample.di.module.app.AppModule
import com.example.daggerexample.di.module.fragment.fragment1.Fragment1Module
import com.example.daggerexample.di.module.fragment.fragment2.Fragment2Module
import com.example.daggerexample.di.module.fragment.fragment3.Fragment3Module
import com.example.daggerexample.di.scope.AppScope
import com.example.daggerexample.ui.AppActivity
import com.example.daggerexample.ui.screen1.Fragment1
import com.example.daggerexample.ui.screen2.Fragment2
import com.example.daggerexample.ui.screen3.Fragment3
import dagger.Component
import dagger.android.AndroidInjectionModule

@AppScope
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        Fragment1Module::class,
        Fragment2Module::class,
        Fragment3Module::class,
        ActivityModule::class,
        NetModule::class
    ]
)
interface AppComponent {
    fun inject(activity: AppActivity)

    fun inject(fragment1: Fragment1)

    fun inject(fragment2: Fragment2)

    fun inject(fragment3: Fragment3)
}
