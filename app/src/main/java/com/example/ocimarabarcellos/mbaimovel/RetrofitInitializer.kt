package com.example.ocimarabarcellos.mbaimovel

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitInitializer {

    val retrofit =  Retrofit.Builder()
                .baseUrl("https://mbaocimara.firebaseio.com/.json")
                .addConverterFactory(GsonConverterFactory.create())
                .build()



    fun userService(): UsuarioService {
        return retrofit.create(UsuarioService::class.java)

    }

}

