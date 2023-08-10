package com.example.registrationchallengeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_summary.text_view_summary

class Summary : AppCompatActivity() {
    lateinit var data:RegistrationData
    lateinit var textSummary:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)
        data = intent.getSerializableExtra("data") as RegistrationData
        displaySummary()
    }

    private fun displaySummary() {
        textSummary = """
            Full Name : ${data.firstName} ${data.lastName}
            Email     : ${data.email}
            Phone     : ${data.phone}
            Password  : ${data.password}
            
            Thank you for registering.
        """.trimIndent()

        text_view_summary.text = textSummary
    }
}