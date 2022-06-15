package com.example.netflixclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.netflixclone.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
   private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.mainActivityAppbar.appbarSearch.setOnClickListener{
            Toast.makeText(this, "search tapped", Toast.LENGTH_SHORT).show()
        }
    }


}
