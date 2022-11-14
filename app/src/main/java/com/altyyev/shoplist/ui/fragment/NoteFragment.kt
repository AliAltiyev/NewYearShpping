package com.altyyev.shoplist.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.altyyev.shoplist.base.BaseFragment
import com.altyyev.shoplist.databinding.FragemntNoteBinding

class NoteFragment : BaseFragment() {

    private lateinit var binding: FragemntNoteBinding
    override fun onClick() {
        TODO("Not yet implemented")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragemntNoteBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        @JvmStatic
        fun newInstance() = NoteFragment()
    }
}