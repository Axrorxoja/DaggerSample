package com.example.daggerexample.di.subcomponent

import com.example.daggerexample.di.module.fragment.fragment2.Fragment2Module
import com.example.daggerexample.di.scope.FragmentScope
import com.example.daggerexample.ui.screen2.Fragment2
import dagger.Subcomponent
import dagger.android.AndroidInjector

@FragmentScope
@Subcomponent(modules = [Fragment2Module::class])
interface Fragment2SubComponent : AndroidInjector<Fragment2> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<Fragment2>
}
