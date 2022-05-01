package com.example.s4m4viewmodelmvvmnoticiasapi04.repository.interactor

import com.example.s4m4viewmodelmvvmnoticiasapi04.repository.retrofit.Noticias
import com.example.s4m4viewmodelmvvmnoticiasapi04.repository.retrofit.NoticiasAPIService
import com.example.s4m4viewmodelmvvmnoticiasapi04.repository.retrofit.RestEngine
import retrofit2.Call

class NoticiasInteractor {

    fun traerRespuesta(languages: String): Noticias? {
        val llamada: NoticiasAPIService =
            RestEngine.getRestEngine().create(NoticiasAPIService::class.java)
        val resultado: Call<Noticias> = llamada.obtenerNoticias(languages)
        val p: Noticias? = resultado.execute().body()

        return p
    }

}