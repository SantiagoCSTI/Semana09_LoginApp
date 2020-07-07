package com.example.loginapp.REST


import com.example.loginapp.pojo.UsuarioBE
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface IUsuario {
    //ValidarUsuario?pLogin=pssolis@cibertec.edu.pe&pContrasenia=123456789
    @GET("Usuario/ValidarUsuario")
    @Headers( "Content-Type: application/json")
    fun ValidarUsuario(
        @Query(value = "pLogin") pLogin:String,
        @Query(value = "pContrasenia") pContrasenia:String): Call<UsuarioBE>

}