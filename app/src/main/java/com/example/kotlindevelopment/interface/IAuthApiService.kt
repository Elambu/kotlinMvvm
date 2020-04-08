package com.example.kotlindevelopment.`interface`

import com.example.kotlindevelopment.constants.IAPIConstants
import com.example.kotlindevelopment.model.LoginRequest
import com.example.kotlindevelopment.model.LoginResponse
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface IAuthApiService {

    @POST(IAPIConstants.POST_LOGIN)
    fun postLogin(@Body request: LoginRequest?): Single<LoginResponse?>?

}
