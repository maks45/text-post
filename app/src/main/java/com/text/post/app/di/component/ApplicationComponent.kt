package com.text.post.app.di.component

import com.text.post.app.di.module.NetworkModule
import com.text.post.app.di.module.RoomModule
import com.text.post.app.repository.TextRepository
import com.text.post.app.view.MainActivity
import dagger.Component

@Component(modules = [RoomModule::class, NetworkModule::class])
interface ApplicationComponent {
    fun injectMainActivity(mainActivity: MainActivity)

    //fun injectLoginActivity(loginActivity: LoginActivity)

    //fun injectTextDetailActivity(textDetailActivity: TextDetailActivity)
}