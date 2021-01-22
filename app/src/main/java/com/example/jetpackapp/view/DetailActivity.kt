package com.example.jetpackapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jetpackapp.R
import com.example.jetpackapp.helpers.Logger
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class DetailActivity : AppCompatActivity() {
    val TAG_NAME="DetailActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Logger.e(message = "onCreate $TAG_NAME")

    }

    override fun onStart() {
        super.onStart()
        Logger.e(message = "onStart $TAG_NAME")
    }

    override fun onResume() {
        super.onResume()
        Logger.e(message = "onResume $TAG_NAME")

    }

    override fun onPause() {
        super.onPause()
        Logger.e(message = "onPause $TAG_NAME")

    }

    override fun onStop() {
        super.onStop()
        Logger.e(message = "onStop $TAG_NAME")

    }

    override fun onDestroy() {
        super.onDestroy()
        Logger.e(message = "onDestroy $TAG_NAME")

    }

    override fun onRestart() {
        super.onRestart()
        Logger.e(message = "onRestart $TAG_NAME")

    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Logger.e(message = "onTrimMemory $TAG_NAME")

    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Logger.e(message = "onSaveInstanceState $TAG_NAME")

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Logger.e(message = "onRestoreInstanceState $TAG_NAME")

    }

}