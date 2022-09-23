package com.example.reporting_presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ReportingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reporting)
    }

    companion object {

        fun start(context: Context) {
            context.startActivity(Intent(context, ReportingActivity::class.java))
        }
    }
}