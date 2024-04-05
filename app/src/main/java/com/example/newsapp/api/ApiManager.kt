package com.example.newsapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiManager {
    const val apiKey = "3ab0896d73fa46fc83d6a9311d44c22a"
    private var retrofit: Retrofit? = null
    fun getWebServices(): NewsServices{
        if (retrofit == null){
            retrofit = Retrofit.Builder()
                .baseUrl("https://newsapi.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!.create(NewsServices::class.java)
    }

}