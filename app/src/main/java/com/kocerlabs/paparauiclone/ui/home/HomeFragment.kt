package com.kocerlabs.paparauiclone.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kocerlabs.paparauiclone.R
import com.kocerlabs.paparauiclone.databinding.FragmentHomeBinding
import com.kocerlabs.paparauiclone.ui.base.BaseFragment
import com.kocerlabs.paparauiclone.ui.home.viewpagerfragment.HomePagerFragment1
import com.kocerlabs.paparauiclone.ui.home.viewpagerfragment.HomePagerFragment2
import com.kocerlabs.paparauiclone.ui.home.viewpagerfragment.HomePagerFragment3
import com.kocerlabs.paparauiclone.ui.home.viewpagerfragment.HomePagerFragment4
import com.kocerlabs.paparauiclone.ui.home.viewpagerfragment.HomePagerFragment5
import com.kocerlabs.paparauiclone.ui.home.viewpagerfragment.HomePagerFragment6
import com.kocerlabs.viewpager2withnavigation.onboarding.ViewPagerAdapter

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bottomNav =
            requireActivity().findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.visibility = View.VISIBLE

        initViewPagers()
        initTransactions()
    }

    private fun initViewPagers() {
        val fragmentList = listOf<Fragment>(
            HomePagerFragment1(),
            HomePagerFragment2(),
            HomePagerFragment3(),
            HomePagerFragment4(),
            HomePagerFragment5(),
            HomePagerFragment6(),
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            viewLifecycleOwner.lifecycle
        )
        with(binding!!) {
            viewPager2.adapter = adapter
            dotIndicator.visibility = View.VISIBLE
            dotIndicator.attachTo(viewPager2)
        }
    }

    private fun initTransactions() {

    }

}