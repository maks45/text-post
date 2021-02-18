package com.text.post.app.room

import androidx.room.Dao
import androidx.room.Query
import com.text.post.app.model.Text

@Dao
interface TextDao {

    @Query("SELECT * FROM texts")
    fun getAllTexts(): List<Text>
}