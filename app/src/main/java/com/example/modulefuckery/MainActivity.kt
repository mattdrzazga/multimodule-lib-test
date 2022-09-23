package com.example.modulefuckery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reporting_presentation.ReportingActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ReportingActivity.start(this)
    }
}