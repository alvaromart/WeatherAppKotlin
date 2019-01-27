package com.alvaromart.weatherapp.domain.commands

import com.alvaromart.weatherapp.domain.datasource.ForecastProvider
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

/**
 * Created by alvaro on 27/1/19.
 */

class RequestDayForecastCommandTest {

    @Test
    fun `provider is called when command is executed`() {
        val forecastProvider = mock(ForecastProvider::class.java)
        val command = RequestDayForecastCommand(2, forecastProvider)

        command.execute()

        verify(forecastProvider).requestForecast(2)
    }
}