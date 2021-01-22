package com.example.jetpackapp.helpers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class Extensions {

    fun AppCompatActivity.startNew(toStart: AppCompatActivity){

        startActivity(Intent(this,toStart.javaClass))
    }

}