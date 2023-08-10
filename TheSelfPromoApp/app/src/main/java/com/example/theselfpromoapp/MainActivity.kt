package com.example.theselfpromoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.button_preview_message
import kotlinx.android.synthetic.main.activity_main.check_box_junior
import kotlinx.android.synthetic.main.activity_main.check_immediate_start
import kotlinx.android.synthetic.main.activity_main.spinner_job_title
import kotlinx.android.synthetic.main.activity_main.text_input_edit_text_input_display_name
import kotlinx.android.synthetic.main.activity_main.text_input_edit_text_input_name
import kotlinx.android.synthetic.main.activity_main.text_input_edit_text_input_number
import kotlinx.android.synthetic.main.activity_main.text_input_edit_text_input_start_date

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinnerValues: Array<String> = arrayOf("1", "2", "3", "4")

        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, spinnerValues)
        spinner_job_title.adapter = spinnerAdapter

        button_preview_message.setOnClickListener {
            onPreviewClicked()
        }

    }

    private fun onPreviewClicked() {
        //LETTER
        val message = Message(
            text_input_edit_text_input_name?.text.toString(),
            text_input_edit_text_input_number?.text.toString(),
            text_input_edit_text_input_display_name.text.toString(),
            check_box_junior.isChecked,
            spinner_job_title.selectedItem?.toString(),
            check_immediate_start.isChecked,
            text_input_edit_text_input_start_date.text.toString()
        )
        //FROM,TO
        val previewActivityIntent = Intent(this, PreviewActivity::class.java)
        //PUT EXTRA CONTENT INSIDE
        previewActivityIntent.putExtra("message",message)


        startActivity(previewActivityIntent)

    }
}
