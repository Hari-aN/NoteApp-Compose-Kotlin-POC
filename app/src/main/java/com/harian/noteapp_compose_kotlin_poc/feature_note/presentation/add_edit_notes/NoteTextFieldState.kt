package com.harian.noteapp_compose_kotlin_poc.feature_note.presentation.add_edit_notes

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
