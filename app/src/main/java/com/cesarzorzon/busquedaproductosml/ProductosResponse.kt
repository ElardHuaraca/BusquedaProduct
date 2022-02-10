package com.cesarzorzon.busquedaproductosml

import com.google.gson.annotations.SerializedName


data class ProductosResponse(
    @SerializedName("results")
    var resulted: Result
    )
    data class Result (
        @SerializedName("thumbnail")
        var images: List<String>
        )

