package com.example.kotlindevelopment.model

  data class LoginRequest (
       var appInstanceId: String? = null,
       var clientId: Long = 0,
       var firebaseToken: String? = null,
       var id: String? = null,
       var languageIsoCode: String? = null,
       var originId : Int = 0,
       var otp: String? = null,
       var password: String? = null,
       var roleId: Long? = null
   
)
