package com.example.newsapp.ui.screen.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.example.newsapp.R
import com.example.newsapp.data.base.LocaleInfo
import com.example.newsapp.ui.base.MainActivity
import com.example.newsapp.ui.base.constants.ViewConstants
import java.util.*

class SplashActivity : AppCompatActivity() {
    var handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        LocaleInfo.locale = Locale.getDefault()
        LocaleInfo.setLanguage()
        LocaleInfo.setCountry()

        handler.postDelayed({
            startMovieActivity()
        }, ViewConstants.DELAY_TIME)
    }

    private fun startMovieActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}