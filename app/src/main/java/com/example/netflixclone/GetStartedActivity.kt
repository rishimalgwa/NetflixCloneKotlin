package com.example.netflixclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.netflixclone.databinding.ActivityGetStartedBinding


class GetStartedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGetStartedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetStartedBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()
        binding.getStartedButton.setOnClickListener{
            getStatedOnClick()
        }
        binding.getStartedSignIn.setOnClickListener{
            intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getStatedOnClick() {
        val intent : Intent = Intent(this,SignUpActivity::class.java)
        startActivity(intent)
    }
}