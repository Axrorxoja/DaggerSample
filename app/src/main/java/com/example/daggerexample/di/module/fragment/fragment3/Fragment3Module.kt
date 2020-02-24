package com.example.daggerexample.di.module.fragment.fragment3

import com.example.daggerexample.di.scope.FragmentScope
import com.example.daggerexample.domain.Fragment3Object
import dagger.Module
import dagger.Provides

@Module
class Fragment3Module {
    @FragmentScope
    @Provides
    fun provideFragmentObject() = Fragment3Object()
}