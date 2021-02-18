package com.text.post.app.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "texts")
class Text(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long?,
    @ColumnInfo(name = "content")
    val text: String,
    //@ColumnInfo(name = "date_time")
    //val dateTime: LocalDateTime,
    //@ColumnInfo(name = "text_publicity")
    //val textPublicity: TextPublicity,
    val owner: String,
    //add it later with one to many relation
    //val watchers: List<String>
)