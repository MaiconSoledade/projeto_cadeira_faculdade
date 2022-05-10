package com.example.caique.goomer.entity

import com.example.caique.goomer.entity.ApiRestaurant
import com.example.caique.goomer.entity.PaginationRestaurants
import com.google.gson.annotations.SerializedName

class ApiGetRestaurants (
        @SerializedName("_links") val links: PaginationRestaurants,
        @SerializedName("items") val items: List<ApiRestaurant>
    )