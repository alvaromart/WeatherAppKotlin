package com.alvaromart.weatherapp.domain.datasource

import com.alvaromart.weatherapp.domain.model.Forecast
import com.alvaromart.weatherapp.domain.model.ForecastList
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mockito.*

/**
 * Created by alvaro on 27/1/19.
 */

class ForecastProviderTest {

    @Test
    fun `data source returns a value`() {
        val ds = mock(ForecastDataSource::class.java)
        `when`(ds.requestDayForecast(0)).then {
            Forecast(0, 0, "desc", 20, 0, "url")
        }

        val provider = ForecastProvider(listOf(ds))
        assertNotNull(provider.requestForecast(0))
    }

    @Test
    fun `empty database returns server value`() {

        val db = mock(ForecastDataSource::class.java)
        val server = mock(ForecastDataSource::class.java)
        val sampleForecastList = ForecastList(0, "city", "country", listOf())
        `when`(server.requestForecastByZipCode(ArgumentMatchers.anyLong(),
                ArgumentMatchers.anyLong()))
                .then {
                    sampleForecastList
                }

        val provider = ForecastProvider(listOf(db, server))
        assertNotNull(provider.requestByZipCode(0,0))
        assertEquals(provider.requestByZipCode(0,0), sampleForecastList)
    }
}