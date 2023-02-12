package com.data.core.service

import com.data.core.itens.bebida.Agua
import com.data.core.itens.bebida.BuilderDrink
import com.data.core.itens.bebida.CocaCola
import com.data.core.itens.bebida.Guarana
import com.data.core.itens.lanche.BuilderHamburger
import com.data.core.itens.lanche.XEgg
import com.data.core.itens.lanche.XSalada
import com.data.core.itens.lanche.XTudo
import com.data.core.itens.resultado.Result
import com.data.core.port.DrinkPort
import com.data.core.port.HamburgerPort
import com.data.core.port.OrderServicePort
import com.data.entrypoint.request.DrinksRequest
import com.data.entrypoint.request.HamburgersRequest
import com.data.entrypoint.request.OrderRequest
import jakarta.inject.Singleton

@Singleton
class OrderService() : OrderServicePort {
    override fun generateOrderValue(order: OrderRequest): Result {
        var hamburgers: HamburgerPort
        var drinks: DrinkPort

        hamburgers = BuilderHamburger()
        drinks = BuilderDrink()

        if (order.hamburgers.isNotEmpty()) {
            order.hamburgers.forEach {
                when (it) {
                    HamburgersRequest.XTUDO -> hamburgers = XTudo(hamburger = hamburgers)
                    HamburgersRequest.XSALADA -> hamburgers = XSalada(hamburger = hamburgers)
                    HamburgersRequest.XEGG -> hamburgers = XEgg(hamburger = hamburgers)
                }
            }
        }

        if (order.drinks.isNotEmpty()) {
            order.drinks.forEach {
                when (it) {
                    DrinksRequest.COCACOLA -> drinks = CocaCola(drinks)
                    DrinksRequest.GUARANA -> drinks = Guarana(drinks)
                    DrinksRequest.AGUA -> drinks = Agua(drinks)
                }
            }
        }

        return Result(hamburgers, drinks)
    }
}