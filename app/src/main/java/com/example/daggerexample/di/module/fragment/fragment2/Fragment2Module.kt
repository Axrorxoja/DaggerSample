package com.example.daggerexample.di.module.fragment.fragment2

import com.example.daggerexample.domain.Fragment2Object
import dagger.Module
import dagger.Provides

@Module
class Fragment2Module {

    @Provides
    fun provideFragmentObject() = Fragment2Object()

}