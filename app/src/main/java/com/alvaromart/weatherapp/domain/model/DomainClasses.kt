package com.alvaromart.weatherapp.domain.model

/**
 * Created by alvaro on 14/1/19.
 */

data class ForecastList(val city: String, val country: String,
                        private val dailyForecast: List<Forecast>) {
    val size: Int
        get() = dailyForecast.size

    operator fun get(position: Int) = dailyForecast[position]
}

data class Forecast(val date: String, val description: String, val high: Int, val low: Int,
                    val iconUrl: String)