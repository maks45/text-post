package com.text.post.app.di.module

import androidx.lifecycle.MutableLiveData
import com.text.post.app.model.Text
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LiveDataModule {

    @Singleton
    @Provides
    fun textLiveData(): MutableLiveData<List<Text>> {
        return MutableLiveData();
    }

}