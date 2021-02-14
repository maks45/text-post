package com.text.post.app.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.text.post.app.R
import com.text.post.app.model.Text
import com.text.post.app.model.User
import com.text.post.app.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    lateinit var mainActivityViewModel: MainActivityViewModel
    val isUpdateObserver = Observer<Boolean> {
        //TODO update ui
    }
    val textsObserver = Observer<List<Text>>{
        //TODO update ui
    }
    val userObserver = Observer<User> {
        //TODO update ui
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        mainActivityViewModel.isUpdateLiveData.observe(this, isUpdateObserver)
        mainActivityViewModel.textLiveData.observe(this, textsObserver)
        mainActivityViewModel.userLiveData.observe(this, userObserver)

    }

    override fun onStop() {
        super.onStop()
        mainActivityViewModel.isUpdateLiveData.removeObserver(isUpdateObserver)
        mainActivityViewModel.textLiveData.removeObserver(textsObserver)
        mainActivityViewModel.userLiveData.removeObserver(userObserver)
    }
}