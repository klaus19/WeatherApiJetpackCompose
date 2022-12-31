package com.example.stateflowjetpackcompose


import android.annotation.SuppressLint
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
@SuppressLint("StaticFieldLeak")
class AppViewmodel @Inject constructor(

):ViewModel() {

    private val _titleInputFlow = MutableStateFlow<String>("")
    val titleInputFlow:StateFlow<String> get() = _titleInputFlow

    fun setTitle(title: String){
        _titleInputFlow.value=title
    }

    fun resetTitle(){
        _titleInputFlow.value = ""
    }
}