package com.manish.sampledesignpattern

import android.app.Application

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        PreferencesManager.init(applicationContext)
        PreferencesManager.saveData("user", "Manish")
    }
}