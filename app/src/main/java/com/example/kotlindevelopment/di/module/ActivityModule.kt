package com.example.kotlindevelopment.di.module

import com.example.kotlindevelopment.ui.view.activity.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [FragmentModule::class])
    abstract fun bindLoginActivity(): LoginActivity
}