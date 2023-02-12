package com.data.core.port

import com.data.core.itens.resultado.Result
import com.data.entrypoint.request.OrderRequest

interface OrderServicePort {
    fun generateOrderValue(order: OrderRequest): Result
}