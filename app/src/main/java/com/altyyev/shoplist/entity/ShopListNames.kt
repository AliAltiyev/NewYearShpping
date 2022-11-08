package com.altyyev.shoplist.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "shopListNames")
data class ShopListNames(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "time")
    val time: String,
    @ColumnInfo(name = "allItemCounter")
    val allItemCounter: Int,
    @ColumnInfo(name = "checkedItemConter")
    val checkedItemCounter: Int,
    @ColumnInfo(name = "ItemIds")
    val itemIds: String
) : Serializable
