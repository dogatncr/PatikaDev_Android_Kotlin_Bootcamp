package com.example.notesapp.noteDetailsFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.notesapp.R
import com.example.notesapp.data.NoteModel

class NotesDetailFragment :Fragment() {
    private lateinit var NoteDetailHeader:TextView
    private lateinit var NoteBody:TextView
    private lateinit var arrowBackicon : ImageButton
    private lateinit var navController: NavController

    /** Creating notes detail fragment **/
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notes_detail, container, false)
    }

    /** Initialized navigation controller and called set up views **/
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navController = findNavController()
        super.onViewCreated(view, savedInstanceState)
        setupViews(view)
    }

    /** Setting up notes detail views **/

    private fun setupViews(view: View) {
        NoteDetailHeader = view.findViewById(R.id.NoteDetailHeader)
        NoteBody = view.findViewById(R.id.NoteBody)
        arrowBackicon = view.findViewById(R.id.backArrow)

        arguments?.let {
            val noteData = it.getString("noteModel")

            noteData?.let { safeNoteData ->
                val note = NoteModel.fromJson(safeNoteData)

                NoteDetailHeader.text = note.NoteDetailHeader
                NoteBody.text = note.NoteBody

            }
        }
        /** Navigation (going back) for arrow back button **/
        arrowBackicon.setOnClickListener {
            navController.navigate(R.id.action_notesDetailFragment_to_notesFragment, Bundle().apply {
            })
        }
    }


}

