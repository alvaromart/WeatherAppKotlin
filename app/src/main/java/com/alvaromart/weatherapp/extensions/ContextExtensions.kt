package com.alvaromart.weatherapp.extensions

import android.content.Context
import android.support.v4.content.ContextCompat

/**
 * Created by alvaro on 21/1/19.
 */

fun Context.color(res: Int): Int = ContextCompat.getColor(this, res)