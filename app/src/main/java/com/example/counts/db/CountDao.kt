package com.example.counts.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CountDao{

    @Insert()
    fun insert(count: Count)

    @Update()
    fun update(count: Count)

    @Delete()
    fun delete(count: Count)

    @Query("DELETE FROM count_table")
    fun clear()

    @Query("SELECT * FROM count_table ORDER BY countId DESC LIMIT 1")
    fun getCount(): Count?

    @Query("SELECT * FROM count_table ORDER BY countId DESC ")
    fun getAllCount(): LiveData<List<Count>>

}