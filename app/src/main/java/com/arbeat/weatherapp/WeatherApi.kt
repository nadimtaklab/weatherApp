package com.arbeat.weatherapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("current")
    suspend fun getWeather(
        @Query("access_key") accessKey: String,
        @Query("query") query: String
    ): WeatherResponse

    companion object{
        const val BASE_URL = "http://api.weatherstack.com/"
        const val ACCESS_KEY = "27f0421edf58d5e47d85a6e1f4deca5e"

        fun create(): WeatherApi{
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()

            return retrofit.create(WeatherApi::class.java)
        }
    }
}