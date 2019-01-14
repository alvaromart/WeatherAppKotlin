package com.alvaromart.weatherapp.domain.commands

import com.alvaromart.weatherapp.data.ForecastRequest
import com.alvaromart.weatherapp.domain.mappers.ForecastDataMapper
import com.alvaromart.weatherapp.domain.model.ForecastList

/**
 * Created by alvaro on 14/1/19.
 */

class RequestForecastCommand(private val zipCode: String) :
        Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}