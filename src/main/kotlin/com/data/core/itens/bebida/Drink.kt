package com.data.core.itens.bebida

import com.data.core.port.DrinkPort

abstract class Drink(private val drink: DrinkPort) : DrinkPort {

    override fun order(): String {
        return drink.order()
    }

    override fun cost(): Double {
        return drink.cost()
    }
}