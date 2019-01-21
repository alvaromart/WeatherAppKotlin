package com.alvaromart.weatherapp.domain.datasource

import com.alvaromart.weatherapp.domain.model.Forecast
import com.alvaromart.weatherapp.domain.model.ForecastList

/**
 * Created by alvaro on 18/1/19.
 */

interface ForecastDataSource {
    fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList?

    fun requestDayForecast(id: Long): Forecast?
}