package com.example.kmm_sample

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().reversed().contains("iOS"), "Check iOS is mentioned")
    }
}