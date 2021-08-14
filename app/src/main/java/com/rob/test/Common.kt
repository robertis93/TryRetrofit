package com.rob.test

object Common {

   // private val BASE_URL = "https://www.simplifiedcoding.net/demos/"
          // private val BASE_URL = "http://api.openweathermap.org/data/2.5/"
           private val BASE_URL = "https://api.openweathermap.org/"
    val retrofitService: RetrofitServices
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices::class.java)
}

