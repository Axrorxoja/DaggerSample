package com.example.daggerexample.di.module.fragment.fragment1

import com.example.daggerexample.domain.Fragment1Object
import dagger.Module
import dagger.Provides

@Module
class Fragment1Module {

    @Provides
    fun provideFragmentObject() = Fragment1Object()

}