package com.alvaromart.weatherapp.extensions

import java.text.DateFormat
import java.util.*

/**
 * Created by alvaro on 21/1/19.
 */

fun Long.toDateString(dateFormat: Int = DateFormat.MEDIUM): String {
    val df = DateFormat.getDateInstance(dateFormat, Locale.getDefault())
    return df.format(this)
}

fun Long.toDateString(dateFormat: Int = DateFormat.MEDIUM, local: Locale): String {
    val df = DateFormat.getDateInstance(dateFormat, local)
    return df.format(this)
}
