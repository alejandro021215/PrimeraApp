package com.example.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //Declaracion de las variables
    lateinit var primerBoton:Button
    lateinit var segundoBoton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("mi_App","Estoy en el método onCreate")
        //inicializar las variables
        primerBoton = findViewById(R.id.primer_boton)
        segundoBoton = findViewById(R.id.segundo_boton)

        primerBoton.setOnClickListener(View.OnClickListener {
            var miIntent = Intent(this,SegundaActivity::class.java)
            startActivity(miIntent)

        })

        segundoBoton.setOnClickListener {
            var miIntent = Intent(this,TerceraActivity::class.java)
            startActivity(miIntent)
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("mi_App","Estoy en el método onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("mi_App","Estoy en el método onPause")
    }
}