package com.rob.test

import com.google.gson.annotations.SerializedName

data class Movie(
    var name: String? = null,
    var realname: String? = null,
    var team: String? = null,
    var firstapperance: String? = null,
    var createdby: String? = null,
    var publisher: String? = null,
    var imageurl: String? = null,
    var bio: String? = null
)

data class Example (
    @SerializedName("cod") var cod : String,
    @SerializedName("message") var message : Double,
    @SerializedName("cnt") var cnt : Double,
    @SerializedName("list") var list : List<ForecastResponse>,
    @SerializedName("city") var city : City

)

data class WeatherForecastResult(
    val city: City,
    val cnt: Double,
    val cod: String,
    val list: List<ForecastResponse>,
    val message: Double
)

data class City(
    @SerializedName("id") var id : Double,
    @SerializedName("name") var name : String,
    @SerializedName("coord") var coord : Coord,
    @SerializedName("country") var country : String
)

data class ForecastResponse (
    @SerializedName("dt") var dt : Double,
    @SerializedName("main") var main : Main,
    @SerializedName("weather") var weather : List<Weather>,
    @SerializedName("clouds") var clouds : Clouds,
    @SerializedName("wind") var wind : Wind,
    @SerializedName("rain") var rain : Rain,
    @SerializedName("sys") var sys : Sys,
    @SerializedName("dt_txt") var dtTxt : String

)


data class Coord (
    @SerializedName("lat") var lat : Double,
    @SerializedName("lon") var lon : Double

)

data class Clouds (

    @SerializedName("all") var all : Double

)

data class Main(
    val grnd_level: Double,
    val humidity: Int,
    val pressure: Double,
    val sea_level: Double,
    val temp: Double,
    val temp_kf: Float,
    val temp_max: Double,
    val temp_min: Double
)

class Rain ()

data class Sys (
    @SerializedName("pod") var pod : String

)

data class Weather (
    @SerializedName("id") var id : Int,
    @SerializedName("main") var main : String,
    @SerializedName("description") var description : String,
    @SerializedName("icon") var icon : String
)


data class Wind (
    @SerializedName("speed") var speed : Double,
    @SerializedName("deg") var deg : Double,
    @SerializedName("gust") var gust : Double
)




//class WeatherResponse {
//    @SerializedName("coord")
//    var coord: Coord? = null
//
//    @SerializedName("sys")
//    var sys: Sys? = null
//
//    @SerializedName("weather")
//    var weather = ArrayList<Weather>()
//
//    @SerializedName("main")
//    var main: Main? = null
//
//    @SerializedName("wind")
//    var wind: Wind? = null
//
//    @SerializedName("rain")
//    var rain: Rain? = null
//
//    @SerializedName("clouds")
//    var clouds: Clouds? = null
//
//    @SerializedName("dt")
//    var dt = 0f
//
//    @SerializedName("id")
//    var id = 0
//
//    @SerializedName("name")
//    var name: String? = null
//
//    @SerializedName("cod")
//    var cod = 0f
//}
//
//class Weather {
//    @SerializedName("id")
//    var id = 0
//
//    @SerializedName("main")
//    var main: String? = null
//
//    @SerializedName("description")
//    var description: String? = null
//
//    @SerializedName("icon")
//    var icon: String? = null
//}
//
//class Clouds {
//    @SerializedName("all")
//    var all = 0f
//}
//
//class Rain {
//    @SerializedName("3h")
//    var h3 = 0f
//}
//
//class Wind {
//    @SerializedName("speed")
//    var speed = 0f
//
//    @SerializedName("deg")
//    var deg = 0f
//}
//
//class Main {
//    @SerializedName("temp")
//    var temp = 0f
//
//    @SerializedName("humidity")
//    var humidity = 0f
//
//    @SerializedName("pressure")
//    var pressure = 0f
//
//    @SerializedName("temp_min")
//    var temp_min = 0f
//
//    @SerializedName("temp_max")
//    var temp_max = 0f
//}
//
//class Sys {
//    @SerializedName("country")
//    var country: String? = null
//
//    @SerializedName("sunrise")
//    var sunrise: Long = 0
//
//    @SerializedName("sunset")
//    var sunset: Long = 0
//}
//
//class Coord {
//    @SerializedName("lon")
//    var lon = 0f
//    @SerializedName("lat")
//    var lat = 0f
//}