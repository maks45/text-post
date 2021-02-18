package com.text.post.app.repository

import androidx.lifecycle.LiveData
import com.text.post.app.di.module.NetworkModule
import com.text.post.app.di.module.RoomModule
import com.text.post.app.model.Text
import javax.inject.Inject

class TextRepository @Inject constructor(
    var RoomModule: RoomModule,
    var networkModule: NetworkModule) {

}