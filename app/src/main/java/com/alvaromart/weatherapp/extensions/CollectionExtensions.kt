package com.alvaromart.weatherapp.extensions

/**
 * Created by alvaro on 17/1/19.
 */

fun <K, V : Any> MutableMap<K, V?>.toVarargArray():
        Array<out Pair<K, V>> = map({ Pair(it.key, it.value!!) }).toTypedArray()
