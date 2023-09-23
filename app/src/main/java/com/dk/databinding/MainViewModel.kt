package com.dk.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val mutableLiveDataFirst= MutableLiveData("Kotlin")

    fun setUserData(){
        mutableLiveDataFirst.value = "Android"
     }
}