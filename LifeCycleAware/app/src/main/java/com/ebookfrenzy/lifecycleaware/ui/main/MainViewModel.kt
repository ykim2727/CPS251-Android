package com.example.lifecycleaware.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import java.time.LocalTime

class MainViewModel : ViewModel() {

    var lifeCycleText = ""

    fun lifeCycleEnd():String{
        lifeCycleText += "************\n"
        return lifeCycleText
    }

    fun activityCreated(): String{
        if(lifeCycleText.isNullOrEmpty()){
            lifeCycleText = "onCreate was fired on " + LocalTime.now() + "\n"
        }else{
            lifeCycleText += "onCreate was fired on " + LocalTime.now() + "\n"
        }
        return lifeCycleText
    }
    fun destroy():String{
        lifeCycleText += "onDestroy was fired on " + LocalTime.now() + "\n"
        return lifeCycleText
    }

    fun start():String{
        lifeCycleText += "onStart was fired on " + LocalTime.now() + "\n"
        return lifeCycleText
    }

    fun pause():String{
        lifeCycleText += "onPause was fired on " + LocalTime.now() + "\n"
        return lifeCycleText
    }

    fun resume(): String{
        lifeCycleText += "onResume was fired on " + LocalTime.now() + "\n"
        return lifeCycleText
    }

    fun stop(): String{
        lifeCycleText += "onStop was fired on " + LocalTime.now() + "\n"
        return lifeCycleText
    }
}