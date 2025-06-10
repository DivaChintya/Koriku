package com.example.apl_koriko

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var editName: EditText
    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText
    private lateinit var registerButton: Button
    private lateinit var progressBar: ProgressBar
    private lateinit var signInText: TextView
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Initialize views
        editName = findViewById(R.id.editName)
        editEmail = findViewById(R.id.editEmail)
        editPassword = findViewById(R.id.editPassword)
        registerButton = findViewById(R.id.register)
        progressBar = findViewById(R.id.progressbar)
        signInText = findViewById(R.id.signin)
        imageView = findViewById(R.id.imageView)

        // Set up listeners
        registerButton.setOnClickListener {
            onRegisterClicked()
        }

        signInText.setOnClickListener {
            // Navigate to Sign In screen (if implemented)
            // startActivity(Intent(this, SignInActivity::class.java))
            Toast.makeText(this, "Redirect to Sign In", Toast.LENGTH_SHORT).show()
        }
    }

    private fun onRegisterClicked() {
        // Show progress bar while processing
        progressBar.visibility = View.VISIBLE

        // Get input values
        val name = editName.text.toString().trim()
        val email = editEmail.text.toString().trim()
        val password = editPassword.text.toString().trim()

        // Simple validation
        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            progressBar.visibility = View.INVISIBLE
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            return
        }

        // Here you would typically call an API or save data to a database
        // For example, registering the user in Firebase or your backend service

        // Simulate a successful registration
        simulateRegistration()
    }

    private fun simulateRegistration() {
        // Simulate some background task, like an API call
        progressBar.postDelayed({
            progressBar.visibility = View.INVISIBLE
            Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show()

            // Optionally, navigate to another screen after success
            // startActivity(Intent(this, HomeActivity::class.java))
            finish() // Close the RegisterActivity and go back
        }, 2000) // Simulated delay of 2 seconds
    }
}
