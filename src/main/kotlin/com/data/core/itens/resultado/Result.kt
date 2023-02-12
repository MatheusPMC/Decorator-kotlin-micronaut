package com.data.core.itens.resultado

import com.data.core.port.DrinkPort
import com.data.core.port.HamburgerPort
import com.data.core.port.ResultPort

open class Result(private val hamburger: HamburgerPort, private val drink: DrinkPort) : ResultPort {
    val lanches = hamburger.order()
    val bebidas = drink.order()
    val cost = cost()

    override fun cost(): Double {
        return hamburger.cost() + drink.cost()
    }
}