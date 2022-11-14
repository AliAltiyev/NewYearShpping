package com.altyyev.shoplist.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.altyyev.shoplist.databinding.ListRecyclerItemBinding
import com.altyyev.shoplist.data.entity.NoteItemRoomModel

class NoteViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ListRecyclerItemBinding.bind(view)

    fun bind(noteItemRoomModel: NoteItemRoomModel) = with(binding) {
        title.text = noteItemRoomModel.title
        description.text = noteItemRoomModel.description
        time.text = noteItemRoomModel.time
    }
}