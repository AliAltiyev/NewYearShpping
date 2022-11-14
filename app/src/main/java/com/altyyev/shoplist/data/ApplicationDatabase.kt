package com.altyyev.shoplist.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.altyyev.shoplist.data.entity.NoteItemRoomModel
import com.altyyev.shoplist.data.entity.ShopListItemRoomModel
import com.altyyev.shoplist.data.entity.ShopListNamesRoomModel
import com.altyyev.shoplist.data.entity.TextHelperLibraryItemModel
import com.altyyev.shoplist.utils.DATABASE_VERSION

@Database(
    entities = [NoteItemRoomModel::class, ShopListItemRoomModel::class, ShopListNamesRoomModel::class, TextHelperLibraryItemModel::class],
    version = DATABASE_VERSION
)
abstract class ApplicationDatabase : RoomDatabase() {
    abstract val dao: Dao
}