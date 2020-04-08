package com.example.kotlindevelopment.managers.interceptor

import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.Response

class BasicAuthInterceptor : Interceptor{

   lateinit var credentials: String

    fun BasicAuthInterceptor() {
         credentials = Credentials.basic("admin", "B7vrzJVexs")
    }

    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request()
        val authenticatedRequest = request.newBuilder()
            .header("Authorization", credentials).build()
        return chain.proceed(authenticatedRequest)
    }

}