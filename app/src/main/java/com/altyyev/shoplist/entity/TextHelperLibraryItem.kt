package com.altyyev.shoplist.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "textHelperLibraryItem")
data class TextHelperLibraryItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @ColumnInfo(name = "name")
    val name: String
)