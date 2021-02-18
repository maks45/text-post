package com.text.post.app.di.component

import com.text.post.app.view.MainActivity
import dagger.Component

@Component
interface ApplicationComponent {
    fun injectMainActivity(mainActivity: MainActivity)
}