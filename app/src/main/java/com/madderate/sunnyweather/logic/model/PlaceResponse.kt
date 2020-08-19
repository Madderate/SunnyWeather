package com.madderate.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String // 一些JSON字段和Kotlin中的命名不一致，可以采用SerializedName注解的方式构成映射
)

data class Location(val lng: String, val lat: String)