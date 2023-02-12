package com.data.core.itens.lanche

import com.data.core.port.HamburgerPort

open class BuilderHamburger : HamburgerPort {

    override fun order() = "Lanche"

    override fun cost(): Double = 0.0
}