package com.example.coroutines.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.delay


class Repository {
    private val _image = MutableLiveData<String>()
    val image: LiveData<String>
        get() = _image
    //merke: erst ab der suspend function braucht man coroutines
    suspend fun loadingImage(){
        delay(5000)
        _image.value = "Kokosnusswasser, gekühlt, erfrischend"
    }
}



