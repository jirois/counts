package com.example.counts.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "count_table")
data class Count(

    @PrimaryKey(autoGenerate = true)
    var countId: Int,

    @ColumnInfo(name= "name")
    var name: String,

    @ColumnInfo(name="number")
    var number: Int
)