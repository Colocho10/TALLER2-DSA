package com.example.taller.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.taller.R

class Promedio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promedio)


        val botonCalcular: Button = findViewById(R.id.btnCalcular)
        botonCalcular.setOnClickListener { realizarCalculo() }

    }


    private fun realizarCalculo() {
        val campoNombre: EditText = findViewById(R.id.idNombreTxt)
        val campoNota1: EditText = findViewById(R.id.idNota1Txt)
        val campoNota2: EditText = findViewById(R.id.idNota2Txt)
        val campoNota3: EditText = findViewById(R.id.idNota3txt)
        val campoNota4: EditText = findViewById(R.id.idNota4Txt)
        val campoNota5: EditText = findViewById(R.id.idNota5Txt)
        val campoResult: TextView = findViewById(R.id.txtResultado)


        val nombre: String = campoNombre.text.toString()
        val Nota1: Double = campoNota1.text.toString().toDouble()
        val Nota2: Double = campoNota2.text.toString().toDouble()
        val Nota3: Double = campoNota3.text.toString().toDouble()
        val Nota4: Double = campoNota4.text.toString().toDouble()
        val Nota5: Double = campoNota5.text.toString().toDouble()

        var prom: Double = (Nota1 + Nota2 + Nota3 + Nota4 + Nota5) / 5
        println("El promedio es: " + prom)
        Log.i("salida", "El promedio es $prom")


        var result = ""

        if (prom >= 6.0) {
            Log.i("salida", result)
            result="aprobado con nota de $prom"
        } else {
            Log.i("salida", result)
            result="reprobado con nota de $prom"
        }

        campoResult.text = "Hola $nombre $result"

        Toast.makeText(this,result , Toast.LENGTH_LONG).show()
    }
}