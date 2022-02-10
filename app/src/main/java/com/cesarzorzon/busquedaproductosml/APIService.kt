package com.cesarzorzon.busquedaproductosml

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface APIService {
    @GET("/sites/MLA/search")
    suspend fun getProducts(@Query("q") id: String): Response<ProductosResponse>
}