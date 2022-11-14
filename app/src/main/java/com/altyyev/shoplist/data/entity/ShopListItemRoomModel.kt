package com.altyyev.shoplist.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopListName")
data class ShopListItemRoomModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "itemChecked")
    val itemChecked: Int = 0,
    @ColumnInfo(name = "listId")
    val listId: Int,
    @ColumnInfo(name = "type")
    val itemType: String = "item"
)
