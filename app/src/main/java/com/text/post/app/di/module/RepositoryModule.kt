package com.text.post.app.di.module

import com.text.post.app.repository.TextRepository
import com.text.post.app.repository.UserRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun textRepository(
        roomModule: RoomModule,
        networkModule: NetworkModule,
        liveDataModule: LiveDataModule
    ): TextRepository {
        return TextRepository(liveDataModule.textLiveData(), roomModule.textDao())
    }

    @Singleton
    @Provides
    fun uerRepository(roomModule: RoomModule, networkModule: NetworkModule): UserRepository {
        return UserRepository(roomModule.userDao())
    }
}