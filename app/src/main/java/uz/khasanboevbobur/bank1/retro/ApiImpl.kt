package uz.khasanboevbobur.bank1.retro

import retrofit2.Call
import retrofit2.http.GET
import uz.khasanboevbobur.bank1.classes.CurrencyRetro

interface ApiImpl {

    @GET("/uz/exchange-rates/json/")
    fun getData(): Call<List<CurrencyRetro>>
}