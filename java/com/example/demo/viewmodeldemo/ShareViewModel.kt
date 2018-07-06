package com.example.demo.viewmodeldemo

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class ShareViewModel : ViewModel(){

    var msg = MutableLiveData<String>()

    /*fun setMessage(msg: String){
        this.msg.value = msg
    }

    fun getMessage(): LiveData<String> {
        return msg
    }*/
}