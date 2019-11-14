package com.example.guitareffefcts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStart.setOnClickListener {
            val intent = Intent(this , MainGuitarEffect::class.java )
            startActivity(intent)
        }
    }
}
