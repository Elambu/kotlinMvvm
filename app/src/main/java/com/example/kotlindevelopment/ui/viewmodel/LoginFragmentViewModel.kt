package com.example.kotlindevelopment.ui.viewmodel

import android.util.Log
import com.example.kotlindevelopment.model.LoginRequest
import com.example.kotlindevelopment.repository.LoginRepository
import javax.inject.Inject

const val TAG = "LoginFragmentViewModel"

class LoginFragmentViewModel @Inject constructor(private val loginRepository: LoginRepository) : BaseViewModel() {

   fun login() {

       // if (networkUtils.isNetworkAvailable(context)) {
            Log.e("onSuccess ","networkUtils response")

            if (!"kjh".isEmpty() && !"kjj".isEmpty()) {

                val loginRequest: LoginRequest = LoginRequest(
                    "FarmerLead-93291251-e4af-4806-9a26-fb4e13ee99db",
                    2,
                    "cZafPrSxRgaXcO8RqnfI1u:APA91bEzINJm3HfrvnjQRZ48ygiNR1MMk4tPPn8-KVs9vit3fjsPa3onJkQ5JBzDtZjw7SdrLqYhhzZ6wwi8kTFwKizBq0ysGuhHQCYDYnx6qJJ5suYGFqzemJf6id7_8lTs6-Amkxgb",
                    "AJAJ0001",
                    "en",
                    1,
                    "",
                    "olam123",
                    2

                )
                loginRepository.postlogin( loginRequest,
                    { loginResponse ->
                        Log.d(TAG, "getNewsData.success() called with size : ${loginResponse?.size}")

                    }, {
                        Log.d(TAG, "getNewsData.error() called with: $it")
                    }, {
                        Log.d(TAG, "getNewsData.terminate() called")
                    }
                ).also { compositeDisposable.add(it) }
            }


       /* loginRepo.postLogin(loginRequest, object : ResponseCallBack<LoginResponse?> {
            override fun onSuccess(loginResponse: LoginResponse?) {
                Log.e("onSuccess response","onSuccess response")
            }

            override fun onError(message: String?) {
                Log.e("onError response","onError response")

            }
        })*/
            }
       /* } else {
         Log.e("error response","error response")
        }*/
 }