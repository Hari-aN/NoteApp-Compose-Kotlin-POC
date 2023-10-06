package com.harian.noteapp_compose_kotlin_poc.feature_note.domain.util

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}
