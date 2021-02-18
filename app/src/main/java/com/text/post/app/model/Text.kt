package com.text.post.app.model

import java.time.LocalDateTime

data class Text(
    val id: Long?,
    val text: String,
    val dateTime: LocalDateTime,
    val textPublicity: TextPublicity,
    val owner: String,
    val watchers: List<String>
)