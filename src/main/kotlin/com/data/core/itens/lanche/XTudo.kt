package com.data.core.itens.lanche

import com.data.core.port.HamburgerPort
import jakarta.inject.Singleton

@Singleton

class XTudo(hamburger: HamburgerPort) : Hamburger(hamburger) {

    override fun order(): String {
        return super.order() + orderWithXtudo()
    }

    override fun cost(): Double = super.cost() + 16.0

    private fun orderWithXtudo(): String = ", XTudo"
}