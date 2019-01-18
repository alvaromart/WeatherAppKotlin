package com.alvaromart.weatherapp.data.server

import com.alvaromart.weatherapp.data.db.ForecastDb
import com.alvaromart.weatherapp.domain.datasource.ForecastDataSource
import com.alvaromart.weatherapp.domain.model.ForecastList

/**
 * Created by alvaro on 18/1/19.
 */

class ForecastServer(
        private val dataMapper: ServerDataMapper = ServerDataMapper(),
        private val forecastDb: ForecastDb = ForecastDb())
    : ForecastDataSource {

    override fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList? {

        val result = ForecastByZipCodeRequest(zipCode).execute()
        val converted = dataMapper.convertToDomain(zipCode, result)
        forecastDb.saveForecast(converted)
        return forecastDb.requestForecastByZipCode(zipCode, date)
    } }