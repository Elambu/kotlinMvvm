package com.example.kotlindevelopment.repository

interface ResponseCallBack<T> {

    fun onSuccess(data: T?)

    fun onError(message: String?)
}