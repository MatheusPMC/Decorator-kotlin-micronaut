package com.data.entrypoint.controller

import com.data.core.itens.resultado.Result
import com.data.core.port.OrderServicePort
import com.data.entrypoint.request.OrderRequest
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller
class OrderController(private val orderService: OrderServicePort) {

    @Post
    fun newOrder(@Body request: OrderRequest): Result {
        return orderService.generateOrderValue(request)
    }
}