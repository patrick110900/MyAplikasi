package com.example.sngri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class Login_Activity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}