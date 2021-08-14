package com.rob.test

import android.app.AlertDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.rob.test.databinding.ActivityMainBinding
import dmax.dialog.SpotsDialog
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

   // lateinit var forecastResponse: ForecastResponse

    lateinit var service: RetrofitServices
    lateinit var layoutManager: LinearLayoutManager
   // lateinit var adapter: MyMovieAdapter
//    lateinit var dialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(getLayoutInflater())
        val view = binding.getRoot()
        setContentView(view)

        service = Common.retrofitService
        // binding.recyclerMovieList.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        //  binding.recyclerMovieList.layoutManager = layoutManager
       // dialog = SpotsDialog.Builder().setCancelable(true).setContext(this).build()

        getAllMovieList()
    }

    private fun getAllMovieList() {
//        dialog.show()
        service.getMovieList(lat, AppId).enqueue(object : Callback<WeatherForecastResult> {
            override fun onFailure(call: Call<WeatherForecastResult>, t: Throwable) {
                binding.text.text = "Error"
            }



            override fun onResponse(call: Call<WeatherForecastResult>, response: Response<WeatherForecastResult>) {
                binding.text.text = response.body()?.city?.country.toString()
            }

        })
    }
    companion object {
        var BaseUrl = "http://api.openweathermap.org/"
        var AppId = "2e65127e909e178d0af311a81f39948c"
        var lat = "london"
        var lon = "139"
    }
}
