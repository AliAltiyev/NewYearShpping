package com.altyyev.shoplist.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "noteItem")
data class NoteItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = " description")
    val description: String,
    @ColumnInfo(name = "time")
    val time: String,
    @ColumnInfo(name = "category")
    val category: String
)
