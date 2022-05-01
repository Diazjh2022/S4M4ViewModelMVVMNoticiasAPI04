package com.example.s4m4viewmodelmvvmnoticiasapi04.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.s4m4viewmodelmvvmnoticiasapi04.repository.interactor.NoticiasInteractor
import com.example.s4m4viewmodelmvvmnoticiasapi04.repository.retrofit.Noticias
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel: ViewModel() {

    val noticias: MutableLiveData<Noticias> = MutableLiveData()
    private val interactor = NoticiasInteractor()

    fun obBtnTraerNoticias(){
        CoroutineScope(Dispatchers.IO).launch {
            noticias.postValue(interactor.traerRespuesta("es"))
        }
    }

}