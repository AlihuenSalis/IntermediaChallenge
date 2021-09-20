package com.intermediachallenge.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuoteProvider @Inject constructor() { // ESTA CLASE USABA EL COMPANION OBJECT, PERO CON LA INYECCION DE DEPENDENCIAS
    // EL COMPANION NO SE USA MAS PORQUE SE ACCEDE DIRECTAMENTE AL OBJETO.
        var quotes:List<QuoteModel> = emptyList()

}