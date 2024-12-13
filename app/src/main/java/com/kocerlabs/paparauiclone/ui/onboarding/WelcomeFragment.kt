package com.kocerlabs.paparauiclone.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kocerlabs.paparauiclone.databinding.FragmentWelcomeBinding
import com.kocerlabs.paparauiclone.ui.base.BaseFragment

class WelcomeFragment : BaseFragment<FragmentWelcomeBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentWelcomeBinding = FragmentWelcomeBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}