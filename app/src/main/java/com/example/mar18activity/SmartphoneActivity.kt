package com.example.mar18activity

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.mar18activity.databinding.ActivitySmartphoneBinding

class SmartphoneActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySmartphoneBinding
    private var listGirl = arrayListOf<String>("Anh", "Muin", "luin")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySmartphoneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = ArrayAdapter(this@SmartphoneActivity, R.layout.spinner_item, listGirl)
        binding.spApdapter.adapter = adapter
    }
}