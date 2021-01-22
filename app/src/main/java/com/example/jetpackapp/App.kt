package com.example.jetpackapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/*
*
Hilt currently supports the following Android classes:

Application (by using @HiltAndroidApp)
Activity
Fragment
View
Service
BroadcastReceiver
* */

@HiltAndroidApp
class App : Application() {
}