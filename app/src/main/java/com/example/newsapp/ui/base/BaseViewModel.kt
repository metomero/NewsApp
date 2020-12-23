package com.example.newsapp.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {
    companion object {
        var errorMessage = MutableLiveData<String>()
    }

    fun getErrorMessage() = errorMessage

}