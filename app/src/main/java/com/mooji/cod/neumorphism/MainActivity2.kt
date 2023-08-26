package com.mooji.cod.neumorphism

import android.graphics.PorterDuff
import android.graphics.drawable.shapes.Shape
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.mooji.cod.neumorphism.databinding.ActivityMain2Binding
import soup.neumorphism.ShapeType

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgBattery.setOnClickListener {

            binding.imgBattery.setShapeType(ShapeType.PRESSED)
            binding.imgBattery.setColorFilter(
                ContextCompat.getColor(this, R.color.blue_light) ,
                PorterDuff.Mode.SRC_IN
            )
            binding.imgClock.clearColorFilter()
            binding.imgClock.setShapeType(ShapeType.FLAT)
            binding.imgRange.clearColorFilter()
            binding.imgRange.setShapeType(ShapeType.FLAT)
            binding.imgWeather.clearColorFilter()
            binding.imgWeather.setShapeType(ShapeType.FLAT)

        }
        binding.imgRange.setOnClickListener {

            binding.imgRange.setShapeType(ShapeType.PRESSED)
            binding.imgRange.setColorFilter(
                ContextCompat.getColor(this, R.color.blue_light) ,
                PorterDuff.Mode.SRC_IN
            )
            binding.imgClock.clearColorFilter()
            binding.imgClock.setShapeType(ShapeType.FLAT)
            binding.imgBattery.clearColorFilter()
            binding.imgBattery.setShapeType(ShapeType.FLAT)
            binding.imgWeather.clearColorFilter()
            binding.imgWeather.setShapeType(ShapeType.FLAT)

        }
        binding.imgClock.setOnClickListener {

            binding.imgClock.setShapeType(ShapeType.PRESSED)
            binding.imgClock.setColorFilter(
                ContextCompat.getColor(this, R.color.blue_light) ,
                PorterDuff.Mode.SRC_IN
            )
            binding.imgBattery.clearColorFilter()
            binding.imgBattery.setShapeType(ShapeType.FLAT)
            binding.imgRange.clearColorFilter()
            binding.imgRange.setShapeType(ShapeType.FLAT)
            binding.imgWeather.clearColorFilter()
            binding.imgWeather.setShapeType(ShapeType.FLAT)

        }
        binding.imgWeather.setOnClickListener {

            binding.imgWeather.setShapeType(ShapeType.PRESSED)
            binding.imgWeather.setColorFilter(
                ContextCompat.getColor(this, R.color.blue_light) ,
                PorterDuff.Mode.SRC_IN
            )
            binding.imgClock.clearColorFilter()
            binding.imgClock.setShapeType(ShapeType.FLAT)
            binding.imgRange.clearColorFilter()
            binding.imgRange.setShapeType(ShapeType.FLAT)
            binding.imgBattery.clearColorFilter()
            binding.imgBattery.setShapeType(ShapeType.FLAT)

        }



    }
}