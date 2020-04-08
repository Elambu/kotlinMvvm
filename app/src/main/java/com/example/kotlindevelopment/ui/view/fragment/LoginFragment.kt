package com.example.kotlindevelopment.ui.view.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.kotlindevelopment.databinding.FragmentLoginBinding
import com.example.kotlindevelopment.ui.viewmodel.LoginFragmentViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class LoginFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: LoginFragmentViewModel by lazy {
        ViewModelProviders
            .of(this, viewModelFactory)
            .get(LoginFragmentViewModel::class.java)
    }


    lateinit var mcontext : Context

    lateinit var binding: FragmentLoginBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentLoginBinding.inflate(inflater, container, false)
        viewModel.login()
        return binding.root

    }




    companion object {
        @JvmStatic
        val TAG = LoginFragment::class.java.simpleName

        @JvmStatic
        fun newInstance(context: Context) = LoginFragment().apply {
            arguments = Bundle()
            mcontext = context
        }
    }
}

