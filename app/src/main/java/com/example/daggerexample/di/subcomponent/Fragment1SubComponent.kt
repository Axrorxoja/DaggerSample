package com.example.daggerexample.di.subcomponent

import com.example.daggerexample.di.module.fragment.fragment1.Fragment1Module
import com.example.daggerexample.di.scope.FragmentScope
import com.example.daggerexample.ui.screen1.Fragment1
import dagger.Subcomponent
import dagger.android.AndroidInjector

@FragmentScope
@Subcomponent(modules = [Fragment1Module::class])
interface Fragment1SubComponent : AndroidInjector<Fragment1> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<Fragment1>
}
