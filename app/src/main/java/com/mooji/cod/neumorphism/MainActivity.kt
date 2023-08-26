package com.mooji.cod.neumorphism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mooji.cod.neumorphism.databinding.ActivityMainBinding
import soup.neumorphism.ShapeType

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.btnGoToActivity2.setOnClickListener {


            binding.btnGoToActivity2.setShapeType(ShapeType.PRESSED)

            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }



    }
}