package com.example.mar18activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.mar18activity.databinding.ActivityMainBinding
import com.example.mar18activity.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
   private lateinit var binding:ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}