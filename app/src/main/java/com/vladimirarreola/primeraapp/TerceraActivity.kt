package com.vladimirarreola.primeraapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TerceraActivity : AppCompatActivity() {
    lateinit var btnVolver: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)

        btnVolver = findViewById(R.id.atrasCredits)

        btnVolver.setOnClickListener{
            val miIntent = Intent(this, MainActivity::class.java)
            startActivity(miIntent)
        }
    }
}