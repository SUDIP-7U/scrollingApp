package com.example.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ScrollView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Your other code...

        // Access the ScrollView in Kotlin
        val scrollView = findViewById<ScrollView>(R.id.scrollView)

        // Your additional code related to the ScrollView...

    }
}
