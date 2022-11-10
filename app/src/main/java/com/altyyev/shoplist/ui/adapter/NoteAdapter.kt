package com.altyyev.shoplist.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.altyyev.shoplist.R
import com.altyyev.shoplist.base.BaseAdapter
import com.altyyev.shoplist.entity.NoteItem

class NoteAdapter() : BaseAdapter<NoteItem>(
    itemsSame = { old, new -> old.id == new.id },
    contentsSame = { old, new -> old == new }
) {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        inflater: LayoutInflater,
        viewType: Int
    ): RecyclerView.ViewHolder {
        val view =
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.list_recycler_item, parent
                , false)
        return NoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is NoteViewHolder ->{
                holder.bind(getItem(position))
            }
        }
    }
}