package com.data.core.itens.lanche

import com.data.core.port.HamburgerPort

class XEgg(hamburger: HamburgerPort) : Hamburger(hamburger){

    override fun order(): String {
        return super.order() + orderWithXegg()
    }

    override fun cost(): Double = super.cost() + 10.0

    private fun orderWithXegg(): String = ", XEgg"
}