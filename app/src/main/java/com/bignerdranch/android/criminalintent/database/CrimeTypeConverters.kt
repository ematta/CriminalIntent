package com.bignerdranch.android.criminalintent.database

import androidx.room.TypeConverter
import java.util.Date

private const val TAG = "CrimeTypeConverters"

class CrimeTypeConverters {
    @TypeConverter
    fun fromDate(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun toDate(millisSinceEpoch: Long): Date {
        return Date(millisSinceEpoch)
    }
}
