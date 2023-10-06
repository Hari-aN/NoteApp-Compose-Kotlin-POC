package com.harian.noteapp_compose_kotlin_poc.feature_note.domain.use_case

import com.harian.noteapp_compose_kotlin_poc.feature_note.domain.model.InvalidNoteException
import com.harian.noteapp_compose_kotlin_poc.feature_note.domain.model.Note
import com.harian.noteapp_compose_kotlin_poc.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The Title of the note can't be Empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The Content of the note can't be Empty.")
        }
    repository.insertNote(note)
}
}