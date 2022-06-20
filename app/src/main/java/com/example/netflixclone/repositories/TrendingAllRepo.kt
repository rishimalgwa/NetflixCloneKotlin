package com.example.netflixclone.repositories

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.netflixclone.daos.TrendingAllDao
import com.example.netflixclone.models.Result
import com.example.netflixclone.models.TrendingAll

class TrendingAllRepo(private val trendingAllDao: TrendingAllDao) {

    fun getTrendingAll():ArrayList<Result>{
        trendingAllDao.fetchData()
        return  trendingAllDao.trendingAllList
    }
}