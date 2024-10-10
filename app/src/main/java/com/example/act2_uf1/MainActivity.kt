package com.example.act2_uf1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewHola: TextView = findViewById(R.id.textViewHola)
        val textViewMundo: TextView = findViewById(R.id.textViewMundo)
        val color = resources.getColor(R.color.colorfondo, theme)

        textViewHola.text = "Hola"
        textViewMundo.text = "Món"

        val main = findViewById<ConstraintLayout>(R.id.main)
        val button = findViewById<Button>(R.id.button1)

        button.setOnClickListener{
            main.setBackgroundColor(color)
        }



    }
}