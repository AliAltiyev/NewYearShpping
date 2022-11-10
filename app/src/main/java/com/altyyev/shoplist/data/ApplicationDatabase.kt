package com.altyyev.shoplist.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.altyyev.shoplist.entity.NoteItem
import com.altyyev.shoplist.entity.ShopListItem
import com.altyyev.shoplist.entity.ShopListNames
import com.altyyev.shoplist.entity.TextHelperLibraryItem
import com.altyyev.shoplist.utils.DATABASE_VERSION

@Database(
    entities = [NoteItem::class, ShopListItem::class, ShopListNames::class, TextHelperLibraryItem::class],
    version = DATABASE_VERSION
)
abstract class ApplicationDatabase : RoomDatabase() {
    abstract val dao: Dao
}