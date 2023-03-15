package com.ds2.sendmessages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun enviarmensagem(view : View){
        val TextMessage = findViewById<EditText>(R.id.TextMessage)
//        val textbox = findViewById<TextView>(R.id.textbox)
//        textbox.text = message.text;
          val message = TextMessage.text.toString()
          val intent = Intent( this, DisplayMessageActivity::class.java).apply{putExtra( EXTRA_MESSAGE, message)}
          startActivity(intent)
    }
}