package com.harian.noteapp_compose_kotlin_poc.feature_note.presentation.add_edit_notes

import androidx.compose.ui.focus.FocusState

sealed class AddEditNotesEvent {
    data class EnteredTitle(val value: String) : AddEditNotesEvent()
    data class ChangeTitleFocus(val focusState: FocusState) : AddEditNotesEvent()
    data class EnteredContent(val value: String) : AddEditNotesEvent()
    data class ChangeContentFocus(val focusState: FocusState) : AddEditNotesEvent()

    data class ChangeColor(val color: Int) : AddEditNotesEvent()
    object SaveNote : AddEditNotesEvent()
}
