package com.olaz.brollybuddy.api


import com.olaz.brollybuddy.model.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("current.json")
    fun getCurrentWeather(
        @Query("q") location: String,
        @Query("key") apiKey: String
    ): Call<WeatherResponse>
}
