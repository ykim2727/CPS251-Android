package com.ebookfrenzy.addnamesavedata.ui.main

import android.icu.text.StringPrepParseException
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var nameList: String = ""
    private var newName = ""

    fun addName(value: String) {
        this.newName = value
        nameList = nameList + "\n" + newName
    }

    fun getList(): String {
        return nameList
    }
}