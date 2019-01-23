package com.alvaromart.weatherapp.extensions

import android.content.Context
import android.view.View
import android.widget.TextView

/**
 * Created by alvaro on 14/1/19.
 */

val View.ctx: Context
    get() = context

var TextView.textColor: Int
    get() = currentTextColor
    set(value) = setTextColor(value)

fun View.slideExit() {
    if (translationY == 0f) animate().translationY(-height.toFloat())
}

fun View.slideEnter() {
    if (translationY < 0f) animate().translationY(0f)
}
