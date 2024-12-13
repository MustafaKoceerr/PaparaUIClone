package com.kocerlabs.paparauiclone.ui.home.accounttransactions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.kocerlabs.paparauiclone.databinding.FragmentAccountTransactionsBinding
import com.kocerlabs.paparauiclone.ui.base.BaseFragment
import com.kocerlabs.paparauiclone.ui.home.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AccountTransactionsFragment : BaseFragment<FragmentAccountTransactionsBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentAccountTransactionsBinding =
        FragmentAccountTransactionsBinding.inflate(inflater, container, false)

    private val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initTransactions()
    }


    private fun initTransactions() {
        viewModel.transactions.observe(viewLifecycleOwner, Observer {
            binding!!.recyclerAccTrans.apply {
                adapter = AccTransactionAdapter(it)
                layoutManager =
                    LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            }
        })

        viewModel.getAllTransactions()
    }
}