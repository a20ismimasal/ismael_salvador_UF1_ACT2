package com.example.act2_uf1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewHola: TextView = findViewById(R.id.textViewHola)
        val textViewMundo: TextView = findViewById(R.id.textViewMundo)

        textViewHola.text = "Hola"
        textViewMundo.text = "Món"
    }
}