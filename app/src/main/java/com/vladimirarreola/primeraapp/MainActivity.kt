package com.vladimirarreola.primeraapp
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    //Declaraciòn de las variables
    lateinit var firstButton: Button
    lateinit var secondButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("mi_app", "Estoy en el metodo onCreate")

        //Inicializar las variables
        firstButton = findViewById(R.id.button1)
        secondButton = findViewById(R.id.button2)

        firstButton.setOnClickListener(View.OnClickListener {
           val miIntent = Intent(this, SegundaActivity::class.java)
            startActivity(miIntent)
        })

        secondButton.setOnClickListener {
            val miIntent = Intent(this, TerceraActivity::class.java)
            startActivity(miIntent)
        }
    }


    override fun onStart() {
        super.onStart()
        Log.i("mi_app", "Estoy en el metodo onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("mi_app", "Estoy en el metodo onPause")
    }
}