package com.example.mar18activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mar18activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = Intent(this, WelcomeActivity::class.java)
//        binding.btnWelcome.setOnClickListener(View.OnClickListener {
//            startActivity(intent)
//        })
        binding.btnWelcome.setOnClickListener {
            startActivity(intent)
        }
    }
}