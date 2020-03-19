package com.iflippie.level4__example.dao

import androidx.room.*
import com.iflippie.level4__example.Reminder

@Dao
interface ReminderDao {
    @Query("SELECT * FROM reminderTable")
    suspend fun getAllReminders() : List<Reminder>
    @Insert
    suspend fun insertReminder(reminder: Reminder)

    @Delete
    suspend fun deleteReminder(reminder: Reminder)

    @Update
    suspend fun updateReminder(reminder: Reminder)


}