package com.arbeat.weatherapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("current")
    suspend fun getWeather(
        @Query("access_key") accessKey: String,
        @Query("query") query: String,
        @Query("units") units: String = "m"
    ): WeatherResponse

    companion object{
        private const val BASE_URL = "https://api.weatherstack.com/"

        fun create(): WeatherApi{
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

            return retrofit.create(WeatherApi::class.java)
        }
    }
}