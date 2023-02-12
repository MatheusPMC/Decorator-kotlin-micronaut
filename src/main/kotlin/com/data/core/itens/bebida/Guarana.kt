package com.data.core.itens.bebida

import com.data.core.port.DrinkPort

class Guarana(drink: DrinkPort) : Drink(drink) {

    override fun order(): String {
        return super.order() + orderWithGuarana()
    }

    override fun cost(): Double = super.cost() + 16.0

    private fun orderWithGuarana(): String = ", Guaraná"
}