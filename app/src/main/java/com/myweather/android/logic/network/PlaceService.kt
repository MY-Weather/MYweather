package com.myweather.android.logic.network


import retrofit2.http.GET
import retrofit2.http.Query
import com.myweather.android.logic.model. PlaceResponse
import retrofit2.Call

interface PlaceService {    @GET("v2/place?token=\${MYweatherApplication.TOKEN}&lang=zh_CN")
fun searchPlaces(@Query("query")query: String): Call<PlaceResponse>

}