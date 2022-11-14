package com.altyyev.shoplist.data

import com.altyyev.shoplist.data.entity.NoteItemRoomModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val dao: Dao) {

    fun getNotes(): Flow<List<NoteItemRoomModel>> {
        return dao.getAllNotes()
    }

    suspend fun insertNote(noteItemRoomModel: NoteItemRoomModel) {
        dao.insertNote(noteItemRoomModel)
    }

}