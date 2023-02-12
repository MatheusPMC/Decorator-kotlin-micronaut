package com.data.core.port

interface DrinkPort {
    fun order(): String
    fun cost(): Double
}