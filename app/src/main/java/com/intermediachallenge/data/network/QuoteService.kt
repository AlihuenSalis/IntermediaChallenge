package com.intermediachallenge.data.network

import com.intermediachallenge.data.model.DataModel
import com.intermediachallenge.data.model.QuoteModel
import com.intermediachallenge.data.model.ResponseModel
import com.intermediachallenge.webService.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.create
import javax.inject.Inject

class QuoteService @Inject constructor(private val api:QuoteApiClient){

//    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes():List<QuoteModel>{
        return withContext(Dispatchers.IO) {
            val response = api.getAllQuotes()
            response.body() ?: emptyList()
        }
    }

    suspend fun getCharacters():ResponseModel? {
        return withContext(Dispatchers.IO) {
            val response = api.getAllCharacters()
            response.body()
        }
    }
}