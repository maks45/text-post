package com.text.post.app.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.text.post.app.model.Text
import com.text.post.app.model.User

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {
    val textLiveData = MutableLiveData<Text>()
    val userLiveData = MutableLiveData<User>()


}