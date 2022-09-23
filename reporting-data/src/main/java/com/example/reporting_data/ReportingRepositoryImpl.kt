package com.example.reporting_data

import android.util.Log
import com.example.reporting_domain.ReportingRepository
import javax.inject.Inject

class ReportingRepositoryImpl @Inject constructor() : ReportingRepository {

    override fun doSomething() {
        Log.v("ReportingRepositoryImpl", "Doing something important")
    }
}