package com.kocerlabs.paparauiclone.ui.paparacard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kocerlabs.paparauiclone.databinding.FragmentPaparaCardBinding
import com.kocerlabs.paparauiclone.ui.base.BaseFragment

class PaparaCardFragment : BaseFragment<FragmentPaparaCardBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentPaparaCardBinding = FragmentPaparaCardBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}