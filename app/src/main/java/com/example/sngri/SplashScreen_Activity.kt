package com.example.sngri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen_Activity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Menggunakan Handler untuk menunda pemanggilan Intent selama SPLASH_TIME_OUT
        Handler().postDelayed({
            // Membuat Intent untuk memulai aktivitas berikutnya
            val intent = Intent(this, Login_Activity::class.java)
            startActivity(intent)

            // Mengakhiri aktivitas splash screen agar tidak kembali saat tombol kembali ditekan
            finish()
        }, SPLASH_TIME_OUT)
    }
}