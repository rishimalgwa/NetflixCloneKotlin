package com.example.netflixclone.daos

import android.app.Application
import android.util.Log
import com.android.volley.AuthFailureError
import com.android.volley.toolbox.StringRequest
import com.example.netflixclone.MySingleton
import com.example.netflixclone.constants.Urls
import com.example.netflixclone.models.TrendingAll
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json


class TrendingAllDao(private val application: Application) {
     fun fetchData(): TrendingAll {
         lateinit var trendingAll: TrendingAll
        val jsonObjectRequest = object : StringRequest(
            Urls.getTrendingAllUrl,

            { response ->
                 trendingAll = Json.decodeFromString<TrendingAll>(response)
            },
            {
                Log.i("TrendingAllDao,Error: ",it.message.toString())
            })

        {
            @Throws(AuthFailureError::class)
            override fun getHeaders(): Map<String, String> {
                val headers = HashMap<String, String>()
                headers["User-Agent"] = "Mozilla/5.0"
                return headers
            }
        }

        MySingleton.getInstance(application).addToRequestQueue(jsonObjectRequest)
         return trendingAll
    }
}