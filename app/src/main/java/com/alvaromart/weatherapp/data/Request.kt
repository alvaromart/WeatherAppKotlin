package com.alvaromart.weatherapp.data

import android.util.Log
import java.net.URL

/**
 * Created by alvaro on 14/1/19.
 */

class Request(private val url: String) {

    fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}