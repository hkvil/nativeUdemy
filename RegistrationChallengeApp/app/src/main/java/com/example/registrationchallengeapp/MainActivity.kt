package com.example.registrationchallengeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.button_next
import kotlinx.android.synthetic.main.activity_main.spinner_title
import kotlinx.android.synthetic.main.activity_main.textField_edit_text_email
import kotlinx.android.synthetic.main.activity_main.textField_edit_text_first_name
import kotlinx.android.synthetic.main.activity_main.textField_edit_text_last_name
import kotlinx.android.synthetic.main.activity_main.textField_edit_text_password
import kotlinx.android.synthetic.main.activity_main.textField_edit_text_phone

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
    }

    private fun setupViews() {
        val title = arrayOf("Android Developer", "Cloud Engineer", "Machine Learning Developer")
        val titleAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, title)
        spinner_title.adapter = titleAdapter

        button_next.setOnClickListener {
            buttonClicked()
        }
    }

    private fun buttonClicked() {
        val data = RegistrationData(
            spinner_title.selectedItem.toString(),
            textField_edit_text_first_name.text.toString(),
            textField_edit_text_last_name.text.toString(),
            textField_edit_text_email.text.toString(),
            textField_edit_text_phone.text.toString(),
            textField_edit_text_password.text.toString()
        )

        val intent = Intent(this, Summary::class.java).apply {
            putExtra("data",data)
        }

        startActivity(intent)
    }
}