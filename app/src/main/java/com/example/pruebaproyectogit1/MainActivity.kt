package com.example.pruebaproyectogit1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }


    fun autenticarUsuario(nombre: String) {
        if (nombre.isNotEmpty()) {
            println("Usuario $nombre autenticado con éxito") [cite: 42]
        }
    }
}