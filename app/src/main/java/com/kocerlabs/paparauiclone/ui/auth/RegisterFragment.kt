package com.kocerlabs.paparauiclone.ui.auth

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kocerlabs.paparauiclone.databinding.FragmentRegisterBinding
import com.kocerlabs.paparauiclone.ui.base.BaseFragment


class RegisterFragment : BaseFragment<FragmentRegisterBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentRegisterBinding = FragmentRegisterBinding.inflate(layoutInflater, container, false)


}