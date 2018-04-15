package com.example.ocimarabarcellos.mbaimovel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit

class LoginActivity : AppCompatActivity() {

    var user =  Usuario()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var ret = RetrofitInitializer()

        ret.userService().selectUsuarios()








    }
}
