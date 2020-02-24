package com.example.daggerexample.di.subcomponent

import com.example.daggerexample.di.module.fragment.fragment3.Fragment3Module
import com.example.daggerexample.di.scope.FragmentScope
import com.example.daggerexample.ui.screen3.Fragment3
import dagger.Subcomponent
import dagger.android.AndroidInjector

@FragmentScope
@Subcomponent(modules = [Fragment3Module::class])
interface Fragment3SubComponent : AndroidInjector<Fragment3> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<Fragment3>
}
