package com.vladimirarreola.primeraapp

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SegundaActivity : AppCompatActivity() {
    //Declaración de variables
    var contador = 0
    lateinit var btnIncrement:Button
    lateinit var btnDecrement:Button
    lateinit var btnCredits:Button
    lateinit var tvContador:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        val music: MediaPlayer = MediaPlayer.create(this, R.raw.coin)
        val fire: MediaPlayer = MediaPlayer.create(this, R.raw.fire)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        //Inicialización de las variables
        btnIncrement = findViewById(R.id.increment_btn)
        btnDecrement = findViewById(R.id.decrement_btn)
        btnCredits = findViewById(R.id.buttonCredit)
        tvContador = findViewById(R.id.number)
        contador

        Log.d("contador", "$contador")

        btnIncrement.setOnClickListener {

            if(!btnDecrement.isEnabled){
                btnDecrement.isEnabled = true
            }
            if(contador <10){
                btnIncrement.isEnabled = true
                contador++
                tvContador.text = "$contador"
                music.start()
                Log.d("contador", "$contador")
            }else{
                btnIncrement.isEnabled = false
            }

        btnDecrement.setOnClickListener {
            if(!btnIncrement.isEnabled){
                btnIncrement.isEnabled = true
            }
            if(contador<=0){
                btnDecrement.isEnabled = false
            } else{
                btnDecrement.isEnabled = true
                contador--
                tvContador.text = "$contador"
                fire.start()

            }
          }
            btnCredits.setOnClickListener{
                val miIntent = Intent(this, TerceraActivity::class.java)
                startActivity(miIntent)
            }
        }
    }
}