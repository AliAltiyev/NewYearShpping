package com.altyyev.shoplist.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.altyyev.shoplist.data.RepositoryImpl
import com.altyyev.shoplist.data.entity.NoteItemRoomModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    private val repositoryImpl: RepositoryImpl
) : ViewModel() {

    val mutableLiveData: LiveData<List<NoteItemRoomModel>> = repositoryImpl.getNotes().asLiveData()

    fun insertNote(note: NoteItemRoomModel) {
        viewModelScope.launch(Dispatchers.IO) {
            repositoryImpl.insertNote(note)
        }
    }
}