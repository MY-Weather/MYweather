package com.myweather.android.logic

import androidx.lifecycle.liveData
import com.myweather.android.logic.model.Place
import com.myweather.android.logic.network.MYweatherNetwork
import kotlinx.coroutines.Dispatchers



object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO){
        val result = try {
            val placeResponse = MYweatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok"){
                val places = placeResponse.places
                Result.success(places)
            }else {
                        Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e:Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result as Result<*>)
    }

}