package com.intermediachallenge.data

import com.intermediachallenge.data.model.QuoteModel
import com.intermediachallenge.data.model.QuoteProvider
import com.intermediachallenge.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(private val api: QuoteService, private val quoteProvider: QuoteProvider){

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}