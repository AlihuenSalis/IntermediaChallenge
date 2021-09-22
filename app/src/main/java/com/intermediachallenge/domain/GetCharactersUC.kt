package com.intermediachallenge.domain

import com.intermediachallenge.data.QuoteRepository
import com.intermediachallenge.data.model.DataModel
import com.intermediachallenge.data.model.QuoteModel
import com.intermediachallenge.data.model.ResponseModel
import javax.inject.Inject

class GetCharactersUC @Inject constructor(private val repository: QuoteRepository) {

//    private val repository = QuoteRepository()

    // ESTE METODO ASI SIRVE PARA QUE SOLO AL LLAMAR AL CASO DE USO ESTE YA DIRECTAMENTE DEVUELVA EL CALOR DEL INVOKE
    // Y NO HAYA QUE ANDAR HACIENDO POR EJEMPLO, NOMBRECLAS.MIMETODO.TATATA...

//    suspend operator fun invoke(): List<QuoteModel> = repository.getAllQuotes()

    suspend operator fun invoke(): ResponseModel? = repository.getAllCharacters()
}