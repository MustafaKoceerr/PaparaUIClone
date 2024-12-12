package com.kocerlabs.paparauiclone.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kocerlabs.paparauiclone.data.network.model.TransactionModel
import com.kocerlabs.paparauiclone.data.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val repository: HomeRepository
) : ViewModel() {
    val TAG = "HomeViewModel"
    private val _transactions: MutableLiveData<List<TransactionModel>> = MutableLiveData()
    val transactions: LiveData<List<TransactionModel>>
        get() = _transactions

    fun getTransactions() {
        viewModelScope.launch {
            try {
                _transactions.value = repository.getTransactions()
                Log.d(TAG, "Data fetch: ${_transactions.value}")
            } catch (e: Exception) {
                Log.d(TAG, "Cant get data: ${e.message}")
            }
        }

    }

}