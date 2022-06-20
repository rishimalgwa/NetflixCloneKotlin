package com.example.netflixclone.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.netflixclone.R
import com.example.netflixclone.models.Result

class TrendingAllRVAdapter(private val context: Context,private val listener: ITrendingAllRVAdapter):
    RecyclerView.Adapter<TrendingAllRVAdapter.TrendingAllViewHolder>() {
    private val  trendingAllList=ArrayList<Result>()
    inner class TrendingAllViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val imageView = itemView.findViewById<ImageView>(R.id.card_imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingAllViewHolder {
        val viewHolder = TrendingAllViewHolder(LayoutInflater.from(context).inflate(R.layout.item_movie_card,parent,false))
        viewHolder.imageView
            .setOnClickListener {
            listener.onItemClicked()
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: TrendingAllViewHolder, position: Int) {
       val currentItem = trendingAllList[position]
        Glide.with(holder.imageView.context).load("https://image.tmdb.org/t/p/w500/"+currentItem.posterPath).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return trendingAllList.size
    }
    fun updateList(trending: List<Result>){
        trendingAllList.clear()
        trendingAllList.addAll(trending)
        notifyDataSetChanged()
    }
}
interface ITrendingAllRVAdapter{
    fun onItemClicked()
}