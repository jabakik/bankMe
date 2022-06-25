package com.example.bankme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginButton: Button = findViewById(R.id.bm_LogInButt)

        loginButton.setOnClickListener {
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }

    }
}