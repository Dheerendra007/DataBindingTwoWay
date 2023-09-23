package com.dk.databinding

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dk.databinding.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
         binding.mainViewModel = viewModel

        viewModel.mutableLiveDataFirst.observe(this, Observer {
           binding.tvFirstName.text = it
        })
        //Need to set lifecycle owner to know active status of MainActivity
       // binding.lifecycleOwner = this
    }
}

