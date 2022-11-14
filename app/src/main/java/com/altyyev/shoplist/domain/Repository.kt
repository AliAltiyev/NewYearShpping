package com.altyyev.shoplist.domain

import com.altyyev.shoplist.domain.model.NoteItem
import kotlinx.coroutines.flow.Flow

interface Repository {

    fun saveNote(noteItem: NoteItem)

    fun getNotes(): Flow<List<NoteItem>>

}