package com.urbanspts.urbanspts.model.RequestModel.HomeRequest


import com.google.gson.annotations.SerializedName

data class StartPoint(
    @SerializedName("lat")
    var lat: String = "",
    @SerializedName("lng")
    var lng: String = ""
)