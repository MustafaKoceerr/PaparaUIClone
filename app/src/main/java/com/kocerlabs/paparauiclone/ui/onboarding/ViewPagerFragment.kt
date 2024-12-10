package com.kocerlabs.viewpager2withnavigation.onboarding

import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kocerlabs.paparauiclone.databinding.FragmentViewPagerBinding
import com.kocerlabs.paparauiclone.ui.base.BaseFragment


class ViewPagerFragment : BaseFragment<FragmentViewPagerBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentViewPagerBinding = FragmentViewPagerBinding.inflate(inflater, container, false)


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)


//        val fragmentList = listOf<Fragment>(
//            FirstScreen(),
//            SecondScreen(),
//            ThirdScreen()
//        )
//
//        val adapter = ViewPagerAdapter(
//            fragmentList,
//            requireActivity().supportFragmentManager,
//            viewLifecycleOwner.lifecycle
//        )
//
//        binding.viewPager.adapter = adapter

        return view
    }


}