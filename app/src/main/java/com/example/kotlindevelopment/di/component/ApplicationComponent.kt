package com.example.kotlindevelopment.di.component

import android.app.Application
import com.example.kotlindevelopment.DevelopmentApplication
import com.example.kotlindevelopment.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        RepositoryModule::class,
        ActivityModule::class,
        ContextModule::class])
interface ApplicationComponent : AndroidInjector<DevelopmentApplication> {

        @Component.Builder
        interface Builder {
            @BindsInstance
            fun application(application: Application): Builder

            fun build(): ApplicationComponent
        }
    }