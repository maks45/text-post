package com.text.post.app.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.text.post.app.model.Text
import com.text.post.app.model.User

@Database(entities = [Text::class, User::class], exportSchema = false, version = 1)
abstract class TextRoomDatabase : RoomDatabase() {
    abstract fun textDao(): TextDao

    abstract fun userDao(): UserDao

    //can be used without dagger
    /*companion object {
        @Volatile
        private var INSTANCE: TextRoomDatabase? = null

        fun getDatabase(context: Context): TextRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TextRoomDatabase::class.java,
                    "text_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }*/
}