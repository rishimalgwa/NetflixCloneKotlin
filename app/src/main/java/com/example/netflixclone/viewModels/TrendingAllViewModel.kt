package com.example.netflixclone.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.netflixclone.daos.TrendingAllDao
import com.example.netflixclone.models.Result
import com.example.netflixclone.repositories.TrendingAllRepo

class TrendingAllViewModel(application: Application) : AndroidViewModel(application)  {
    private val trendingAllRepo: TrendingAllRepo
    lateinit var trendingAllList : ArrayList<Result>
    init {
        val dao = TrendingAllDao(application)
        trendingAllRepo = TrendingAllRepo(dao)


    }
    fun getTrendingAll() {
        trendingAllList= trendingAllRepo.getTrendingAll()
    }
}