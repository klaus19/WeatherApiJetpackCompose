package com.example.stateflowjetpackcompose.model

import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkingService {


    @GET("data/2.5/onecall?exclude=minutely,hourly,alerts&lang=en&units=imperial")
    suspend fun fetchWeather(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("appid") appid: String = "734f6271be530776814c3d32ee5f0c03"
    ): WeatherApiResponse
}