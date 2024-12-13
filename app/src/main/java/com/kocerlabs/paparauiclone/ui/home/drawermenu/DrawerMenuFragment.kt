package com.kocerlabs.paparauiclone.ui.home.drawermenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.kocerlabs.paparauiclone.databinding.FragmentDrawerMenuBinding
import com.kocerlabs.paparauiclone.ui.base.BottomBaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DrawerMenuFragment : BottomBaseFragment<FragmentDrawerMenuBinding>() {
    // base fragmentta her şeyi hallettim.
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDrawerMenuBinding =
        FragmentDrawerMenuBinding.inflate(layoutInflater, container, false)

    private val viewModel: DrawerMenuViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        initLeftMenu()
        initSetOnClickers(binding!!.root)

    }

    private fun initLeftMenu() {
        viewModel.leftMenu.observe(viewLifecycleOwner, Observer { leftMenu ->
            with(binding!!.recyclerLeftMenu) {
                adapter = MenuAdapter(leftMenu)
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            }
        })
        viewModel.getLeftMenu()
    }


}