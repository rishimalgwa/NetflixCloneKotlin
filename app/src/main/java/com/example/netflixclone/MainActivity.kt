package com.example.netflixclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.netflixclone.adapters.ITrendingAllRVAdapter
import com.example.netflixclone.adapters.TrendingAllRVAdapter
import com.example.netflixclone.databinding.ActivityMainBinding
import com.example.netflixclone.viewModels.TrendingAllViewModel


class MainActivity : AppCompatActivity(), ITrendingAllRVAdapter {
   private  lateinit var binding: ActivityMainBinding
   private lateinit var trendingAllViewModel: TrendingAllViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.mainActivityAppbar.appbarSearch.setOnClickListener{
            Toast.makeText(this, "search tapped", Toast.LENGTH_SHORT).show()
        }

        val recyclerView  = findViewById<RecyclerView>(R.id.trending_now_RV)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = TrendingAllRVAdapter(this,this)
        recyclerView.adapter = adapter
        trendingAllViewModel = ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(application)).get(TrendingAllViewModel::class.java)
         trendingAllViewModel.trendingAllList.observe(this) { list ->
             list?.let {
                 adapter.updateList(list)
             }
         }

    }

    override fun onItemClicked() {
        TODO("Not yet implemented")
    }


}
