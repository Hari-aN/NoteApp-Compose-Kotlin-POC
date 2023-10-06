package com.harian.noteapp_compose_kotlin_poc.feature_note.presentation.util

sealed class Screen(
    val route: String
) {
    object NoteScreen : Screen("notes_screen")
    object AddEditNoteScreen : Screen("add_edit_notes_screen")
}
