package com.text.post.app.di.module

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.text.post.app.di.component.ApplicationComponent
import com.text.post.app.room.TextDao
import com.text.post.app.room.TextRoomDatabase
import com.text.post.app.room.UserDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule constructor(val app: Application){

    @Singleton
    @Provides
    fun textRoomDatabase(): TextRoomDatabase{
        return Room.databaseBuilder(app, TextRoomDatabase::class.java, "db").build()
    }

    @Singleton
    @Provides
    fun textDao(textRoomDatabase: TextRoomDatabase): TextDao {
        return textRoomDatabase.textDao()
    }

    @Singleton
    @Provides
    fun userDao(textRoomDatabase: TextRoomDatabase): UserDao {
        return textRoomDatabase.userDao()
    }
}