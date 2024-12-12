package com.kocerlabs.paparauiclone.data.repository

import com.kocerlabs.paparauiclone.data.network.HomeApi
import com.kocerlabs.paparauiclone.data.network.model.TransactionModel
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val api: HomeApi,
) : SafeApiCall() {

    suspend fun getTransactions(): List<TransactionModel> = safeApiCall { api.getTransactions() }

}