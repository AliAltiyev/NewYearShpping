package com.altyyev.shoplist.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.altyyev.shoplist.data.entity.NoteItemRoomModel
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Query("SELECT * FROM noteItem")
    fun getAllNotes(): Flow<List<NoteItemRoomModel>>

    @Insert
    suspend fun insertNote(note: NoteItemRoomModel)
}