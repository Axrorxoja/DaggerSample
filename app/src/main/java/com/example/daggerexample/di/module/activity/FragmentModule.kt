package com.example.daggerexample.di.module.activity

import androidx.fragment.app.Fragment
import com.example.daggerexample.di.subcomponent.Fragment1SubComponent
import com.example.daggerexample.di.subcomponent.Fragment2SubComponent
import com.example.daggerexample.di.subcomponent.Fragment3SubComponent
import com.example.daggerexample.ui.screen1.Fragment1
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(
    subcomponents = [
        Fragment1SubComponent::class,
        Fragment2SubComponent::class,
        Fragment3SubComponent::class
    ]
)
interface FragmentModule {

//    @FragmentScope
//    @ContributesAndroidInjector(modules = [Fragment1Module::class])
//    fun fragment1(): Fragment1
//
//    @FragmentScope
//    @ContributesAndroidInjector(modules = [Fragment2Module::class])
//    fun fragment2(): Fragment2
//
//    @FragmentScope
//    @ContributesAndroidInjector(modules = [Fragment3Module::class])
//    fun fragment3(): Fragment3

    @Binds
    @IntoMap
    @ClassKey(Fragment1::class)
    abstract fun fragment1(factory: Fragment1SubComponent.Factory): AndroidInjector.Factory<*>

    @Binds
    @IntoMap
    @ClassKey(com.example.daggerexample.ui.screen2.Fragment2::class)
    abstract fun fragment2(factory: Fragment2SubComponent.Factory): AndroidInjector.Factory<*>

    @Binds
    @IntoMap
    @ClassKey(com.example.daggerexample.ui.screen3.Fragment3::class)
    abstract fun fragment3(factory: Fragment3SubComponent.Factory): AndroidInjector.Factory<*>


}
