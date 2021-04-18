package com.example.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class TerceraActivity : AppCompatActivity() {
    //Declaracion de variables
    lateinit var cuartoButton: Button

    lateinit var tvNombre: TextView
    lateinit var tvCarrera:TextView
    lateinit var tvSemestre:TextView
    lateinit var tvMate:TextView
    lateinit var tvMaestro:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)
        Log.i("mi_App","Estoy en el método onCreate")
        //inicializar las variables
        cuartoButton = findViewById(R.id.cuarto_boton)

        cuartoButton.setOnClickListener(View.OnClickListener {
            var miIntent = Intent(this,MainActivity::class.java)
            startActivity(miIntent)

        })

        tvNombre = findViewById(R.id.tvNombre)
        tvCarrera = findViewById(R.id.tvCarrera)
        tvSemestre = findViewById(R.id.tvSemestre)
        tvMate = findViewById(R.id.tvMate)
        tvMaestro = findViewById(R.id.tvMaestro)

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