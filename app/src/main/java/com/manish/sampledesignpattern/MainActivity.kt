package com.manish.sampledesignpattern

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Original Product object
        val originalProduct = UserProfile(
            id = 1,
            name = "Manish",
            address = "kolkata",
            preferences = listOf("Android","api").toMutableList()
        )
        // Using the copy() method
        val copiedProduct = originalProduct.copy(name = "Kumar")
        // Log the results
        Log.d("CopyMethod", "Original Product: $originalProduct")
        Log.d("CopyMethod", "Copied Product: $copiedProduct")


        // Original Profile object
        val originalProfile = Profile(1,"mk")
        // Using the clone() method
        val copiedProfile = originalProfile.clone()
        // Log the results
        Log.d("CopyMethod", "Original Profile: ${copiedProfile.name}")
        Log.d("CopyMethod", "Copied profile: ${copiedProfile.name}")
    }
}