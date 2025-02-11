package com.bignerdranch.android.criminalintent.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
import java.util.UUID

private const val TAG = "Crime"

@Entity
data class Crime(
    @PrimaryKey val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean,
    val suspect: String = ""
)