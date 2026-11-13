package pt.uptomar.dam2026.nomeutempo.retrofit

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import pt.uptomar.dam2026.nomeutempo.retrofit.service.LocalService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {
    val host = "http://10.0.2.2/"

    private val gson: Gson = GsonBuilder().setLenient().create()

    private val retrofit = Retrofit.Builder()
        .baseUrl(host)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    fun localService() = retrofit.create(LocalService::class.java)
}