package com.manish.sampledesignpattern

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.manish.sampledesignpattern.factory.AdminValidationFactory
import com.manish.sampledesignpattern.factory.UserValidationFactory
import com.manish.sampledesignpattern.factory.ValidationFactory

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
        // logic
        val isAdmin = true // Dynamically determine this value in real scenarios

        val factory: ValidationFactory = if (isAdmin) AdminValidationFactory() else UserValidationFactory()

        val validator = factory.createValidator()
        val errorFormatter = factory.createErrorFormatter()

        val input = "abc"
        if (!validator.validate(input)) {
            println(errorFormatter.formatError(input))
        } else {
            println("Validation successful!")
        }
    }
}