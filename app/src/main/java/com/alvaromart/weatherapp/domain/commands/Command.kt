package com.alvaromart.weatherapp.domain.commands

/**
 * Created by alvaro on 14/1/19.
 */

public interface Command<out T> {
    fun execute(): T
}
