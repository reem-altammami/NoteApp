package com.reem.noteapp.feature_note.presentation.notes

import com.reem.noteapp.feature_note.domain.model.Note
import com.reem.noteapp.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder : NoteOrder):NotesEvent()
    data class DeleteNot(val note : Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
