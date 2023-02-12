package com.data.entrypoint.request

data class OrderRequest(
        val hamburgers: List<HamburgersRequest> = listOf(),
        val drinks: List<DrinksRequest> = listOf()
)