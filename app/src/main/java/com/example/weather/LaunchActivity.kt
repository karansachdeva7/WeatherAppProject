package com.example.weather

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        Handler().postDelayed({
            val intent = Intent(this@LaunchActivity, WeatherActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}