package com.example.kotlindevelopment.di.module

import com.example.kotlindevelopment.`interface`.IAuthApiService
import com.example.kotlindevelopment.repository.LoginRepository
import com.example.kotlindevelopment.repository.LoginRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ApiModule::class])
class RepositoryModule {

    @Provides
    @Singleton
    fun provideLoginRepository(webService: IAuthApiService):LoginRepository {
        return LoginRepositoryImpl(webService)
    }
}