package com.data.core.itens.bebida

import com.data.core.port.DrinkPort

class Agua(drink: DrinkPort) : Drink(drink) {

    override fun order(): String {
        return super.order() + orderWithAgua()
    }

    override fun cost(): Double = super.cost() + 3.0

    private fun orderWithAgua(): String = ", Agua"
}