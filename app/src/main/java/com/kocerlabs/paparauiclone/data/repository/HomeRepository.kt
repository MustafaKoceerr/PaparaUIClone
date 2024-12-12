package com.kocerlabs.paparauiclone.data.repository

import com.kocerlabs.paparauiclone.data.network.HomeApi
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val api: HomeApi,
) : SafeApiCall() {

    suspend fun getTransactions() = safeApiCall { api.getTransactions() }

}