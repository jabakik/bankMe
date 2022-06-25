package com.example.bankme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginButton: Button = findViewById(R.id.bm_LogInButt)
        val password: EditText = findViewById(R.id.bm_PhPass_In)
        val pastext: TextView = findViewById(R.id.bm_PhPass)
        val pasText1: TextView = findViewById(R.id.bm_PhPass1)


        loginButton.setOnClickListener {
            if(password.text.toString()=="admin") {
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)}else{password.error}
    }
    }
}