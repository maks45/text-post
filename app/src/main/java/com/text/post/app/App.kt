package com.text.post.app

import android.app.Application
import com.text.post.app.di.component.DaggerApplicationComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        //val appComponent: DaggerApplicationComponent.Builder().build()
    }
}