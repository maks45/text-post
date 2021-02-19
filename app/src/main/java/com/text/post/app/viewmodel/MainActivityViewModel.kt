package com.text.post.app.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.text.post.app.model.Text
import com.text.post.app.model.User
import com.text.post.app.repository.TextRepository
import com.text.post.app.repository.UserRepository
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(
    application: Application,
    textRepository: TextRepository,
    userRepository : UserRepository,
) : AndroidViewModel(application) {

    /*val textLiveData : LiveData<List<Text>> = MutableLiveData<List<Text>>()
    val userLiveData : LiveData<User> = MutableLiveData<User>()
    val isUpdateLiveData : LiveData<Boolean> = MutableLiveData<Boolean>()*/
}