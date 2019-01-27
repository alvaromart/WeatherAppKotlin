package com.alvaromart.weatherapp

import com.alvaromart.weatherapp.extensions.toDateString
import junit.framework.Assert.assertEquals
import org.junit.Test
import java.text.DateFormat
import java.util.*

/**
 * Created by alvaro on 27/1/19.
 */

class ExtensionsTest {

    @Test
    fun `"longToDateString" returns valid value`() {
        assertEquals("Oct 19, 2015", 1445275635000L.toDateString(DateFormat.MEDIUM,
                Locale.US))
    }

    @Test
    fun `"longToDateString" with full format returns valid value`() {
        assertEquals("Monday, October 19, 2015",
                1445275635000L.toDateString(DateFormat.FULL, Locale.US))
    }
}