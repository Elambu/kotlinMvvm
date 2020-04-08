package com.example.kotlindevelopment.repository

import com.example.kotlindevelopment.`interface`.IAuthApiService
import com.example.kotlindevelopment.model.LoginRequest
import com.example.kotlindevelopment.model.LoginResponse
import com.example.kotlindevelopment.utils.ApiError
import io.reactivex.disposables.Disposable
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginRepository {

    fun postlogin(loginRequest: LoginRequest,
        success: (MutableList<LoginResponse>?) -> Unit,
        failure: (ApiError) -> Unit = {},
        terminate: () -> Unit = {}
    ): Disposable
}
