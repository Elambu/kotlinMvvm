package com.example.kotlindevelopment.ui.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlindevelopment.R
import com.example.kotlindevelopment.di.Injectable
import com.example.kotlindevelopment.ui.view.fragment.LoginFragment
import com.example.kotlindevelopment.utils.ActivityUtils
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity

class LoginActivity : DaggerAppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)
        setupLoginFragment()
    }

    private fun setupLoginFragment() {
        supportFragmentManager.findFragmentById(R.id.fl_main_content) ?: ActivityUtils.replaceFragmentInActivity(
            supportFragmentManager,
            LoginFragment.newInstance(this),
            R.id.fl_main_content,
            false,
            LoginFragment.TAG
        )

    }
}
