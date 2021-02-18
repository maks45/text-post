package com.text.post.app.repository

import androidx.lifecycle.LiveData
import com.text.post.app.model.User

class UserRepository(var userLiveData: LiveData<User>) {
}