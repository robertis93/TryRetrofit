package com.rob.test

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitServices {
    // @GET("forecast?q=london&appid=21a8d636ae57d56ec6fb2ebb46d3e0b4")
    @GET("marvel")
    fun getMovieList(
    ): Call<List<Movie>>

    @GET("data/2.5/forecast?")
    fun getMovieList(
        @Query("q") q: String,
        @Query("appid") appid: String,
        @Query("units") units: String = "metric"
    ): Call<WeatherForecastResult>

//    @GET("data/2.5/weather?")
//    fun getMovieListf(
//        @Query("lat") lat: String,
//        @Query("lon") lon: String,
//        @Query("APPID") app_id: String
//    ): Call<WeatherResponse>
}