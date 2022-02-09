package com.reem.noteapp.feature_note.domain.use_case

import com.reem.noteapp.feature_note.domain.model.Note
import com.reem.noteapp.feature_note.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(int: Int): Note? {
        return repository.getNote(int)
    }
}