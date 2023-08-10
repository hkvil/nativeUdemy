package com.example.theselfpromoapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.button_preview_message
import kotlinx.android.synthetic.main.activity_preview.button_send_message
import kotlinx.android.synthetic.main.activity_preview.text_view_message

class PreviewActivity : AppCompatActivity() {

    private lateinit var message:Message
    private lateinit var messagePreviewText:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)
        //retrive intent
        displayMessage()

    }

    private fun displayMessage() {
        message = intent.getSerializableExtra("message") as Message

        messagePreviewText = """
                Hi ${message.contactName},
                
                My name is ${message.displayName} and I am ${message.getFullJobDescription()}
                
                I have portfolio apps to demonstrate my skills that i can show on request.
                
                I am able to start a new position ${message.getAvalaibility()}.
                
                Please get in touch if you have role for me,
                
                Thanks.
            """.trimIndent()

        text_view_message.text = messagePreviewText
    }

    private fun setupButton(){

        button_send_message.setOnClickListener{
            //Send message intent to other apps
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("smsto:${message.contactNumber}")  // Only SMS apps respond to this.
                putExtra("sms_body", messagePreviewText)
            }
            startActivity(intent)
        }
    }
}