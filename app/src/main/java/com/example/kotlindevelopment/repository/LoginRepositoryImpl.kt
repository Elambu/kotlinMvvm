package com.example.kotlindevelopment.repository

import com.example.kotlindevelopment.`interface`.IAuthApiService
import com.example.kotlindevelopment.model.LoginRequest
import com.example.kotlindevelopment.model.LoginResponse
import com.example.kotlindevelopment.utils.ApiError
import io.reactivex.disposables.Disposable
import javax.inject.Inject

const val TAG: String = "NewsRepository"

class LoginRepositoryImpl @Inject constructor(private val iAuthApiService: IAuthApiService) : LoginRepository {
    override fun postlogin(
        loginRequest: LoginRequest,
        success: (MutableList<LoginResponse>?) -> Unit,
        failure: (ApiError) -> Unit,
        terminate: () -> Unit
    ): Disposable {
        TODO("Not yet implemented")
    }

    /* fun postLogin(request: LoginRequest?, callBack: ResponseCallBack<LoginResponse?>) {
         iAuthApiService?.postLogin(request)?.enqueue(object : Callback<LoginResponse?> {
             override fun onResponse(
                 call: Call<LoginResponse?>,
                 response: Response<LoginResponse?>
             ) {
                 if (response.isSuccessful()) {
                     callBack.onSuccess(response.body())
                 } else {
                     callBack.onError("Error")
                 }
             }

             override fun onFailure(call: Call<LoginResponse?>, t: Throwable) {
                 callBack.onError(t.message)
             }
         })
     }
 */
}
