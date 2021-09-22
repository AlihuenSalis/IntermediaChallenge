package com.intermediachallenge.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuoteProvider @Inject constructor() { // ESTA CLASE USABA EL COMPANION OBJECT, PERO CON LA INYECCION DE DEPENDENCIAS
    // EL COMPANION NO SE USA MAS PORQUE SE ACCEDE DIRECTAMENTE AL OBJETO.
        var quotes:List<QuoteModel> = emptyList()

//    var characters:DataModel? = DataModel(1,0,0,0, emptyList())

    var characters:ResponseModel? = ResponseModel(1,"nada","nada","nada", "nada", null)

}