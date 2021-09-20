package com.intermediachallenge.domain

import com.intermediachallenge.data.model.QuoteModel
import com.intermediachallenge.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUC @Inject constructor(private val quoteProvider: QuoteProvider){

    operator fun invoke():QuoteModel?{
        val quotes = quoteProvider.quotes
        if (!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}