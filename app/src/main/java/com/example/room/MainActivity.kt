package com.example.room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Instanciando los objetos

        val nombre = findViewById<EditText>(R.id.etNombre)
        val usuario = findViewById<EditText>(R.id.etUsuario)
        val consulta = findViewById<EditText>(R.id.etConsulta)
        val pasword = findViewById<EditText>(R.id.etPassword)

        //  Instanciando los botones
        val mostrar = findViewById<Button>(R.id.btnMostrar)
        val guardar = findViewById<Button>(R.id.btnGuardar)

    }
}