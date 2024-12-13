package com.kocerlabs.paparauiclone.ui.moneytransfer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.kocerlabs.paparauiclone.databinding.FragmentMoneyTransferBinding
import com.kocerlabs.paparauiclone.ui.base.BottomBaseFragment
import com.kocerlabs.paparauiclone.ui.home.drawermenu.DrawerMenuViewModel
import com.kocerlabs.paparauiclone.ui.home.drawermenu.MenuAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MoneyTransferFragment : BottomBaseFragment<FragmentMoneyTransferBinding>() {
    // base fragmentta her şeyi hallettim.
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentMoneyTransferBinding =
        FragmentMoneyTransferBinding.inflate(inflater, container, false)

    private val viewModel: DrawerMenuViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initSetOnClickers(binding!!.root)
        initMoneyTransferMenu()
    }

    private fun initMoneyTransferMenu() {
        viewModel.moneyTransferMenu.observe(viewLifecycleOwner, Observer { moneyTransfer ->
            with(binding!!.recyclerLeftMenu) {
                adapter = MenuAdapter(moneyTransfer)
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            }
        })
        viewModel.getMoneyTransferMenu()
    }

}