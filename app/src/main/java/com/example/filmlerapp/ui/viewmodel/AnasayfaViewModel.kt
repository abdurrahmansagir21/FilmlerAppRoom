package com.example.filmlerapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.filmlerapp.data.entity.Filmler
import com.example.filmlerapp.data.repo.FilmlerRepository
import kotlinx.coroutines.launch

class AnasayfaViewModel : ViewModel() {

    var frepo = FilmlerRepository()
    var filmlerlistesi = MutableLiveData<List<Filmler>>()

    init {
        filmleriyukle()
    }
    fun filmleriyukle() {
        viewModelScope.launch {
           filmlerlistesi.value = frepo.filmleriyukle()
        }
    }
}
