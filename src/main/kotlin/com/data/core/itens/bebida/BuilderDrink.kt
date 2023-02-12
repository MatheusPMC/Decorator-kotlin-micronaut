package com.data.core.itens.bebida

import com.data.core.port.DrinkPort

open class BuilderDrink : DrinkPort {

    override fun order() = "Bebida"
    override fun cost(): Double = 0.0
}