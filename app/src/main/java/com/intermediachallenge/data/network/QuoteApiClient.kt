package com.intermediachallenge.data.network

import com.intermediachallenge.data.model.DataModel
import com.intermediachallenge.data.model.QuoteModel
import com.intermediachallenge.data.model.ResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes():Response<List<QuoteModel>>

    @GET("characters?apikey=3a783b25c80e1c44875356dd363f272d&hash=51a3ecf2f92a23817992a2663183325e&ts=1")
    suspend fun getAllCharacters():Response<ResponseModel>
}