package com.altyyev.shoplist.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.altyyev.shoplist.databinding.ListRecyclerItemBinding
import com.altyyev.shoplist.entity.NoteItem

class NoteViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ListRecyclerItemBinding.bind(view)

    fun bind(noteItem: NoteItem) = with(binding) {
        title.text = noteItem.title
        description.text = noteItem.description
        time.text = noteItem.time
    }
}