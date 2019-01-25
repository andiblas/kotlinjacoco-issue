package com.apujadas.jacocokotlin

import org.junit.Assert.assertEquals
import org.junit.Test

class CustomerBuilderTest {

    @Test
    fun testStupidSetters() {
        // WHEN
        val customerBuilder = CustomerBuilder().id(1).name("Test")

        // THEN
        assertEquals(1L, customerBuilder.id)
        assertEquals("Test", customerBuilder.name)
    }

}
