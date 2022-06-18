package com.example.netflixclone.constants

import com.example.netflixclone.BuildConfig


class Urls {
    companion object{
         val getTrendingAllUrl: String = "https://api.themoviedb.org/3/trending/all/day?api_key=${BuildConfig.TMBD_API_KEY}"
    }
}