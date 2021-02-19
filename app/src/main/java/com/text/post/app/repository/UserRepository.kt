package com.text.post.app.repository

import androidx.lifecycle.LiveData
import com.text.post.app.di.module.NetworkModule
import com.text.post.app.di.module.RoomModule
import com.text.post.app.model.User
import com.text.post.app.room.UserDao

class UserRepository(
    val userDao: UserDao
) {
}