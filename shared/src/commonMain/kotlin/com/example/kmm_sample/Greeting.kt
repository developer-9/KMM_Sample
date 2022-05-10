package com.example.kmm_sample

class Greeting {
    fun greeting(): String {
        return "Guess what it is, ${Platform().platform.reversed()}!"
    }
}