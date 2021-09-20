package com.intermediachallenge.di

import com.intermediachallenge.data.network.QuoteApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


//ESTE OBJTO NOS PROVEE DEPENDENCIAS QUE NO SEAN FACILES DE PROVEER COMO LAS OTRAS CON @INJECT
@Module
@InstallIn(SingletonComponent::class) // entre los () va el alcance que queremos que tengan las instancias que creamos
object NetworkModule {

    // proveo retrofit
    @Singleton
    @Provides
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    // proveo ApiClient
    @Singleton
    @Provides
    fun provideQuoteApiClient(retrofit: Retrofit):QuoteApiClient{
        return  retrofit.create(QuoteApiClient::class.java)
    }
}