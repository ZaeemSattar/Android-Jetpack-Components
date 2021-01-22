package com.example.jetpackapp.viewmodels

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.jetpackapp.helpers.Logger


class MainViewmodel @ViewModelInject constructor(@Assisted savedStateHandle: SavedStateHandle) : ViewModel (){

    val TAG_NAME="MainViewmodel"


    init {
        Logger.e(message = "init $TAG_NAME")

    }

    override fun onCleared() {
        super.onCleared()
        Logger.e(message = "onCleared $TAG_NAME")

    }
    
}