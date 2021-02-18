package com.text.post.app.room

import androidx.room.Dao
import androidx.room.Query
import com.text.post.app.model.User

@Dao
interface UserDao {

    @Query ("SELECT * FROM user WHERE email = :userEmail")
    fun getUser(userEmail: String) : User


}