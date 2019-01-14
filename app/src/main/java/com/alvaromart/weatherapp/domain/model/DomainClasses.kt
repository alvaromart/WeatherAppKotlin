package com.alvaromart.weatherapp.domain.model

/**
 * Created by alvaro on 14/1/19.
 */

data class ForecastList(val city: String, val country: String, val dailyForecast:List<Forecast>)

data class Forecast(val date: String, val description: String, val high: Int, val low: Int)