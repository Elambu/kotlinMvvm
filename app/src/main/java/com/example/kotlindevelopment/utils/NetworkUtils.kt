package com.example.kotlindevelopment.utils

import android.content.Context
import android.net.ConnectivityManager


class NetworkUtils constructor(val context: Context?){

    fun isNetworkAvailable(): Boolean {
        val manager =
            context!!.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = manager.activeNetworkInfo
        return if (networkInfo != null && networkInfo.isConnected) {
            true
        } else false
    }
}