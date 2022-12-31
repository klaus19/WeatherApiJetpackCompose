package com.example.stateflowjetpackcompose.repository

import com.example.stateflowjetpackcompose.model.NetworkingService
import com.example.stateflowjetpackcompose.model.WeatherApiResponse
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val networkingService:NetworkingService) {

    suspend fun fetchWeather(long: String, lat: String): WeatherApiResponse =
        networkingService.fetchWeather(lon = long, lat = lat)
}