package com.text.post.app.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.text.post.app.R
import com.text.post.app.di.component.ApplicationComponent
import com.text.post.app.model.Text
import com.text.post.app.model.User
import com.text.post.app.viewmodel.MainActivityViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val mainActivityViewModel: MainActivityViewModel by viewModels()


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
        (application as ApplicationComponent).injectMainActivity(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
       // mainActivityViewModel.isUpdateLiveData.observe(this, isUpdateObserver)
       // mainActivityViewModel.textLiveData.observe(this, textsObserver)
       // mainActivityViewModel.userLiveData.observe(this, userObserver)
    }

    override fun onStop() {
        super.onStop()
       // mainActivityViewModel.isUpdateLiveData.removeObserver(isUpdateObserver)
       // mainActivityViewModel.textLiveData.removeObserver(textsObserver)
       // mainActivityViewModel.userLiveData.removeObserver(userObserver)
    }
}