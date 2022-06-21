package com.example.netflixclone.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.netflixclone.daos.TrendingAllDao
import com.example.netflixclone.models.Result
import androidx.lifecycle.viewModelScope
import com.example.netflixclone.repositories.TrendingAllRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class TrendingAllViewModel(application: Application) : AndroidViewModel(application)  {
    private val trendingAllRepo: TrendingAllRepo
     val trendingAllList : LiveData<ArrayList<Result>>
    init {
        val dao = TrendingAllDao(application)
        trendingAllRepo = TrendingAllRepo(dao)
        trendingAllList = trendingAllRepo.trendingAllList

    }
//    fun getTrendingAll() =viewModelScope.launch(Dispatchers.IO) {
//
//            trendingAllList=  trendingAllRepo.getTrendingAll()
//
//    }
}