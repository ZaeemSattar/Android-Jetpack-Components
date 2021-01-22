package com.example.jetpackapp.helpers

import android.util.Log

object Logger {
    private const val debugTag = "debugTag"
    private const val errorTag: String="errorTag"
    private const val infoTag: String="infoTag"

    fun d(tag: String = debugTag, message: String) {
        Log.d(tag, message)
    }
    fun e(tag: String = errorTag, message: String) {
        Log.e(tag, message)
    }
    fun i(tag: String = infoTag, message: String) {
        Log.i(tag, message)
    }
}