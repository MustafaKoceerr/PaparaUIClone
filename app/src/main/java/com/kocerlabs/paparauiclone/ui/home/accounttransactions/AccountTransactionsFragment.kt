package com.kocerlabs.paparauiclone.ui.home.accounttransactions

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kocerlabs.paparauiclone.databinding.FragmentAccountTransactionsBinding
import com.kocerlabs.paparauiclone.ui.base.BaseFragment

class AccountTransactionsFragment : BaseFragment<FragmentAccountTransactionsBinding>() {
    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentAccountTransactionsBinding =
        FragmentAccountTransactionsBinding.inflate(inflater, container, false)

}