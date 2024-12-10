package com.kocerlabs.paparauiclone.ui.auth

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kocerlabs.paparauiclone.databinding.FragmentLoginBinding
import com.kocerlabs.paparauiclone.ui.base.BaseFragment

class LoginFragment : BaseFragment<FragmentLoginBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentLoginBinding = FragmentLoginBinding.inflate(layoutInflater, container, false)


}