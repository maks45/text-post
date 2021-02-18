package com.text.post.app.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.text.post.app.R
import com.text.post.app.viewmodel.MainActivityViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}