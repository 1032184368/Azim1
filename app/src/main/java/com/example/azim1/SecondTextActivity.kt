package com.example.azim1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_text)
        findViewById<TextView>(R.id.textView).text =
            intent.extras?.getString("shared_text")
    }
}