package com.example.daggerexample.di.module.fragment.fragment3

import com.example.daggerexample.domain.Fragment3Object
import dagger.Module
import dagger.Provides

@Module
class Fragment3Module {
    @Provides
    fun provideFragmentObject() = Fragment3Object()
}