package com.cesarzorzon.busquedaproductosml

import com.google.gson.annotations.SerializedName


data class ProductosResponse(
    @SerializedName("results")
    var resulted: List<Result>
    )

    data class Result (
        @SerializedName("thumbnail")
        var images: String
        )

