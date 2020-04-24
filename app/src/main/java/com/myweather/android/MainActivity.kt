package com.myweather.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (MYweatherApplication.TOKEN.isEmpty()) {
            Toast.makeText(this, "请在MYweatherApplication中填入你申请到的令牌值", Toast.LENGTH_LONG).show()
            finish()
        }
    }
}