package com.alvaromart.weatherapp.ui

import android.app.Application
import com.alvaromart.weatherapp.extensions.DelegatesExt

/**
 * Created by alvaro on 15/1/19.
 */

class App : Application() {

    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}