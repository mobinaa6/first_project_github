package com.example.firstgitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        android.widget.Toast.makeText(this, "hellow every body", Toast.LENGTH_SHORT).show()
        android.widget.Toast.makeText(this, "hellow every body", Toast.LENGTH_SHORT).show()
        android.widget.Toast.makeText(this, "hellow every body", Toast.LENGTH_SHORT).show()
        android.widget.Toast.makeText(this, "hellow every body develop", Toast.LENGTH_SHORT).show()


    }
}