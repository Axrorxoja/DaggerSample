package com.example.daggerexample.di.module.activity

import com.example.daggerexample.di.module.fragment.fragment1.Fragment1Module
import com.example.daggerexample.di.module.fragment.fragment2.Fragment2Module
import com.example.daggerexample.di.module.fragment.fragment3.Fragment3Module
import com.example.daggerexample.di.scope.FragmentScope
import com.example.daggerexample.ui.screen1.Fragment1
import com.example.daggerexample.ui.screen2.Fragment2
import com.example.daggerexample.ui.screen3.Fragment3
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface FragmentModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [Fragment1Module::class])
    fun fragment1(): Fragment1

    @FragmentScope
    @ContributesAndroidInjector(modules = [Fragment2Module::class])
    fun fragment2(): Fragment2

    @FragmentScope
    @ContributesAndroidInjector(modules = [Fragment3Module::class])
    fun fragment3(): Fragment3

}
