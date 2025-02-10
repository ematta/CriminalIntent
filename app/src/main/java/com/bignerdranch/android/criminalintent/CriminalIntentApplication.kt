package com.bignerdranch.android.criminalintent

import android.app.Application

private const val TAG = "CriminalIntentApplication"

class CriminalIntentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}
