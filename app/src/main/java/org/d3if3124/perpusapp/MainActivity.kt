package org.d3if3124.perpusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        setContentView(R.layout.activity_main)
        val greetingTextView = findViewById<TextView>(R.id.helohe)
        val inputField = findViewById<EditText>(R.id.tName)
        val submitButton = findViewById<Button>(R.id.bSudah)
        submitButton.setOnClickListener {
            val enteredName = inputField.text.toString()
            val message = "Selamat Datang, $enteredName"
            greetingTextView.text = message

        }
    }
}
