package com.kocerlabs.paparauiclone.data.network

import com.kocerlabs.paparauiclone.data.network.model.TransactionModel
import retrofit2.http.GET

interface HomeApi {


    @GET("dummy_data_transaction.json")
    suspend fun getTransactions(): TransactionModel

//    val URL = "https://dummyjson.com/"
}