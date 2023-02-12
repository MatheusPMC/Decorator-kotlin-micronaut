package com.data.core.itens.lanche

import com.data.core.port.HamburgerPort

class XSalada(hamburger: HamburgerPort) : Hamburger(hamburger) {

    override fun order(): String {
        return super.order() + orderWithXsalada()
    }

    override fun cost(): Double = super.cost() + 12.0

    private fun orderWithXsalada(): String = ", XSalada"
}