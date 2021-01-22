package com.example.jetpackapp.network.interfaceimpls

import com.example.jetpackapp.network.models.Message

interface ITiingoApiService {
    suspend fun getTestMsg(): Message
}