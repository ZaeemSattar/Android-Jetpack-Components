package com.example.jetpackapp.network.interfaceimpls

import com.example.jetpackapp.network.interfaces.ApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ITiingoApiServiceImpl @Inject constructor(
    private val apiService: ApiService
) : ITiingoApiService {
    override suspend fun getTestMsg() = apiService.getTestMessage()
}