package com.example.ocimarabarcellos.mbaimovel

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface UsuarioService {
    @GET("usuario/")
    fun selectUsuarios(): Call<List<Usuario>>

    @GET("usuario/{id}")
    fun selectUsuario(@Path("id") id: Int): Call<List<Usuario>>

}
