package com.example.netflixclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.netflixclone.databinding.ActivityGetStartedBinding
import com.example.netflixclone.databinding.ActivityLogin2Binding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLogin2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogin2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()
        binding.loginBackButton.setOnClickListener{
            finish()
        }
        binding.loginSignUpTextButton.setOnClickListener{
           intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
    }

}