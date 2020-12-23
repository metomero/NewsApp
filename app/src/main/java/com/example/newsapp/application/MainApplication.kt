package com.example.newsapp.application

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MainApplication : Application() {
    companion object{
        lateinit var appContext : Context
    }

    override fun onCreate() {
        appContext = applicationContext
        super.onCreate()
    }
}