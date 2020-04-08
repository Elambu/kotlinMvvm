package com.example.kotlindevelopment.di.module

import com.example.kotlindevelopment.ui.view.fragment.LoginFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun provideLoginFragment(): LoginFragment
}