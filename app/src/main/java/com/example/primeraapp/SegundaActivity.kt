package com.example.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    //Declaracion de variables
    lateinit var tercerButton:Button
    var contador = 0
    lateinit var btnIncrementar:Button
    lateinit var btnDecrementar:Button
    lateinit var tvContador:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        Log.i("mi_App","Estoy en el método onCreate")
        //inicializar las variables
        tercerButton = findViewById(R.id.tercer_boton)

        tercerButton.setOnClickListener(View.OnClickListener {
            var miIntent = Intent(this,MainActivity::class.java)
            startActivity(miIntent)

        })
        //inicializar el contador y botones
        btnIncrementar = findViewById(R.id.btnIncrementar)
        btnDecrementar = findViewById(R.id.btnDecrementar)
        tvContador = findViewById(R.id.tvNumero)

        btnIncrementar.setOnClickListener {
        contador++

            tvContador.text = "$contador"

            if(!btnDecrementar.isEnabled){
                btnDecrementar.isEnabled = true
            }

            Log.d("contador","$contador")
        }
        btnDecrementar.setOnClickListener {
            if (contador<1){
                btnDecrementar.isEnabled = false
            }else{
                contador--
            }
            tvContador.text = "$contador"
            Log.d("contador","$contador")
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