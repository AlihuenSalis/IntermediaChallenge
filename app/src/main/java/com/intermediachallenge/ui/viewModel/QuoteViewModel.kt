package com.intermediachallenge.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.intermediachallenge.data.model.QuoteModel
import com.intermediachallenge.data.model.QuoteProvider
import com.intermediachallenge.domain.GetCharactersUC
import com.intermediachallenge.domain.GetRandomQuoteUC
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(
    private val getQuoteUseCase:GetCharactersUC,
    private val getRandomQuotesUseCase: GetRandomQuoteUC
) : ViewModel(){

    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()

    fun onCreate() {
        viewModelScope.launch { // ESTE VIEWMODELSCOPE LO QUE HACE ES CONTROLAR LA CORRUTINA POR NOSOTROS.
            isLoading.postValue(true)
            val result = getQuoteUseCase()

            if(!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun randomQuote(){
        isLoading.postValue(true)

        val quote = getRandomQuotesUseCase()
        if (quote!=null){
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
//        val currentQuote = QuoteProvider.random()
//        quoteModel.postValue(currentQuote)
    }

}