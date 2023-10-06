package com.harian.noteapp_compose_kotlin_poc.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.harian.noteapp_compose_kotlin_poc.ui.theme.Blue
import com.harian.noteapp_compose_kotlin_poc.ui.theme.Green
import com.harian.noteapp_compose_kotlin_poc.ui.theme.Pink
import com.harian.noteapp_compose_kotlin_poc.ui.theme.Pink40
import com.harian.noteapp_compose_kotlin_poc.ui.theme.Red
import com.harian.noteapp_compose_kotlin_poc.ui.theme.Yellow

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColor = listOf(Pink, Pink40, Red, Blue, Yellow, Green)
    }
}

class InvalidNoteException(message: String): Exception(message)
