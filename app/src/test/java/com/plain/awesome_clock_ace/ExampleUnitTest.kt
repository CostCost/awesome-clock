package com.plain.awesome_clock_ace

import org.junit.Test

import java.util.*
import java.util.Calendar.getInstance

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val instance = getInstance()
        val get = instance.get(Calendar.HOUR)
        print(get)
    }
}
