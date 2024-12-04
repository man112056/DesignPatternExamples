package com.manish.sampledesignpattern

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.manish.sampledesignpattern.validator.DigitValidator
import com.manish.sampledesignpattern.validator.EmailValidator
import com.manish.sampledesignpattern.validator.LengthValidator

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
        val emailInputField = findViewById<EditText>(R.id.inputFieldId)
        val validateBtn = findViewById<Button>(R.id.validateBtn)
        
        validateBtn.setOnClickListener { 
            performClickAction(emailInputField)
        }
    }

    private fun performClickAction(emailInputField: EditText) {

        val inputValidators = listOf(
            LengthValidator(),
            DigitValidator(),
            EmailValidator()
        )
        val validatorChain = ValidatorChain(inputValidators)
        val inputString = emailInputField.text.toString()
        val result = validatorChain.validate(inputString)


        Toast.makeText(this, "Validation Result: ${result.isValid}, ${result.errorMessagae ?: "Not Valid"}", Toast.LENGTH_SHORT).show()
    }
}