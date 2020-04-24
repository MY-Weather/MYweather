package com.myweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class MYweatherApplication : Application(){
    companion object{
        const val TOKEN= "fSloSdhbG8llDzsy"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}