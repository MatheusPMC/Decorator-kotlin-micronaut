package com.data.core.port

interface HamburgerPort {
    fun order(): String
    fun cost(): Double
}