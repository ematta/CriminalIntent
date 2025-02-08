package com.bignerdranch.android.criminalintent.database

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import java.util.UUID

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): Flow<List<Crime>>

    @Query("SELECT * FROM crime where id=(:id)")
    fun getCrime(id: UUID): Flow<Crime?>
}