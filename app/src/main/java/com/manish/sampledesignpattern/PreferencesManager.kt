package com.manish.sampledesignpattern

import android.content.Context
import android.content.SharedPreferences

object PreferencesManager {
    private const val PREF_NAME = "app_preferences"
    private lateinit var prefrences: SharedPreferences

    fun init(context: Context){
        prefrences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    }

    fun saveData(key: String, value: String){
        prefrences.edit().putString(key, value).apply()
    }

    fun getData(key: String): String?{
        return prefrences.getString(key, null)
    }
}