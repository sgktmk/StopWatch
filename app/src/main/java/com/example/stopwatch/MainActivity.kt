package com.example.stopwatch

import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.Chronometer
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onStart(view: View) {
        val chronometer :Chronometer = findViewById(R.id.c);
        chronometer.base = SystemClock.elapsedRealtime();
        chronometer.start()
    }

    fun onStop(view: View) {
        val chronometer :Chronometer = findViewById(R.id.c);
        chronometer.stop();
    }
}