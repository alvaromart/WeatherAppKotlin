package com.alvaromart.weatherapp.domain.commands

import com.alvaromart.weatherapp.domain.datasource.ForecastProvider
import com.alvaromart.weatherapp.domain.model.ForecastList

/**
 * Created by alvaro on 14/1/19.
 */

class RequestForecastCommand(private val zipCode: Long,
                             private val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<ForecastList> {

    companion object {
        const val DAYS = 7
    }

    override fun execute(): ForecastList = forecastProvider.requestByZipCode(zipCode, DAYS)
}