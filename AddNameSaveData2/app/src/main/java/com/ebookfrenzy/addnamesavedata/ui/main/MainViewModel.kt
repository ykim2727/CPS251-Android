package com.ebookfrenzy.addnamesavedata.ui.main

import android.icu.text.StringPrepParseException
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    var nameList: MutableLiveData<String> = MutableLiveData("")

    fun addName(value:String){
        if(value.isNotBlank()){
            nameList.value = nameList.value + "\n" + value
        }
    }

}