package com.arbeat.weatherapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class WeatherViewModel : ViewModel() {
    private val _weatherData = MutableStateFlow<WeatherResponse?>(null)
    val weatherData: StateFlow<WeatherResponse?> = _weatherData
    private val weatherApi = WeatherApi.create()

    suspend fun fetchWeather(city: String, apiKey: String) {
        try{
            val response = weatherApi.getWeather(city,apiKey)
            _weatherData.value = response
        } catch (e:Exception){
            e.printStackTrace()
        }
    }
}