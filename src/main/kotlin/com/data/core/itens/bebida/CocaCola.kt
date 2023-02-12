package com.data.core.itens.bebida

import com.data.core.port.DrinkPort

class CocaCola(drink: DrinkPort) : Drink(drink) {

    override fun order(): String {
        return super.order() + orderWithCoca()
    }

    override fun cost(): Double = super.cost() + 10.0

    private fun orderWithCoca(): String = ", CocaCola"
}