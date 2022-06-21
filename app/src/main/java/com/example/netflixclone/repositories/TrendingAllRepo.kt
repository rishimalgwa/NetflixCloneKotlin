package com.example.netflixclone.repositories

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.netflixclone.daos.TrendingAllDao
import com.example.netflixclone.models.Result
import com.example.netflixclone.models.TrendingAll
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class TrendingAllRepo(private val trendingAllDao: TrendingAllDao) {
    val trendingAllList: LiveData<ArrayList<Result>> = trendingAllDao.fetchData()
//   suspend fun getTrendingAll():LiveData<ArrayList<Result>>{
//        return  trendingAllDao.fetchData()
//    }
}