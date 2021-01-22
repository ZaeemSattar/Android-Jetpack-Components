package com.example.jetpackapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.jetpackapp.R
import com.example.jetpackapp.helpers.Logger
import com.example.jetpackapp.viewmodels.MainViewmodel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val TAG_NAME="MainActivity"

    private val viewModel: MainViewmodel by viewModels()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.d(message = "onCreate $TAG_NAME")


        Logger.i(message = viewModel.toString())


        start_new.setOnClickListener {
           startActivity(Intent(this, DetailActivity::class.java))
       }

    }

    override fun onStart() {
        super.onStart()
        Logger.d(message = "onStart $TAG_NAME")
    }

    override fun onResume() {
        super.onResume()
        Logger.d(message = "onResume $TAG_NAME")

    }

    override fun onPause() {
        super.onPause()
        Logger.d(message = "onPause $TAG_NAME")

    }

    override fun onStop() {
        super.onStop()
        Logger.d(message = "onStop $TAG_NAME")

    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.d(message = "onDestroy $TAG_NAME")

    }

    override fun onRestart() {
        super.onRestart()
        Logger.d(message = "onRestart $TAG_NAME")

    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Logger.d(message = "onTrimMemory $TAG_NAME")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Logger.d(message = "onSaveInstanceState $TAG_NAME")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Logger.d(message = "onRestoreInstanceState $TAG_NAME")

    }

}