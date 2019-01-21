package com.alvaromart.weatherapp.domain.commands

import com.alvaromart.weatherapp.domain.datasource.ForecastProvider
import com.alvaromart.weatherapp.domain.model.Forecast

/**
 * Created by alvaro on 21/1/19.
 */

class RequestDayForecastCommand(val id: Long,
                                private val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<Forecast> {

    override fun execute() = forecastProvider.requestForecast(id)
}