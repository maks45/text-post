package com.text.post.app.repository

import androidx.lifecycle.MutableLiveData
import com.text.post.app.model.Text
import com.text.post.app.room.TextDao

class TextRepository(
    private val textLiveData: MutableLiveData<List<Text>>,
    private val textDao: TextDao
) {
   fun loadFromCache(){
       textLiveData.value = textDao.getAllTexts()
   }



}