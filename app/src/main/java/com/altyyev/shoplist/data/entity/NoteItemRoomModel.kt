package com.altyyev.shoplist.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "noteItem")
data class NoteItemRoomModel(
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
