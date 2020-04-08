package com.example.kotlindevelopment.model

import android.webkit.WebStorage
import com.google.gson.annotations.SerializedName

data class LoginResponse(

    @SerializedName("accessToken")
    private val accessToken: String? = null,

    @SerializedName("currencyCode")
    private val currencyCode: String? = null,

    @SerializedName("languageIsoCode")
    private val languageIsoCode: String? = null,

    @SerializedName("originId")
    private val originId : Int = 0,

    @SerializedName("origins")
    private val origins: List<Origin?>? = null,

    @SerializedName("otpStatus")
    private val otpStatus : Boolean = false,

    @SerializedName("refreshToken")
    private val refreshToken: String? = null,

    @SerializedName("systemUserId")
    private val systemUserId: String? = null,

    @SerializedName("timeZoneIsoCode")
    private val timeZoneIsoCode: String? = null,

    @SerializedName("tokenExpiry")
    private val tokenExpiry: String? = null,

    @SerializedName("userName")
    private val userName: String? = null
)
