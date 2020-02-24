package com.example.daggerexample.di.module.fragment.fragment2

import com.example.daggerexample.di.scope.FragmentScope
import com.example.daggerexample.domain.Fragment2Object
import dagger.Module
import dagger.Provides

@Module
class Fragment2Module {

    @FragmentScope
    @Provides
    fun provideFragmentObject() = Fragment2Object()

}