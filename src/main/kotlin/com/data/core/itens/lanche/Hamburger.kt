package com.data.core.itens.lanche

import com.data.core.port.HamburgerPort


abstract class Hamburger(private val hamburger: HamburgerPort) : HamburgerPort {

    override fun order(): String {
        return hamburger.order()
    }

    override fun cost(): Double {
        return hamburger.cost()
    }
}