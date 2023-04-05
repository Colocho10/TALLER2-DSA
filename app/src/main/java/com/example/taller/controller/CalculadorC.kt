package com.example.taller.controller

import android.widget.EditText
import android.widget.TextView

class CalculadorC {

    private lateinit var num1: EditText
    private lateinit var num2: EditText
    private lateinit var result: TextView

    fun calculate(op: Char) {

        val Numero1 = num1.text.toString().toDouble()
        val Numero2 = num2.text.toString().toDouble()
        var Resultado = 0.0


        when (op) {
            '+' -> Resultado = Numero1 + Numero2
            '-' -> Resultado = Numero1 - Numero2
            '*' -> Resultado = Numero1 * Numero2
            '/' -> Resultado = Numero1 / Numero2
        }


        result.text = "Resultado: $Resultado"
    }
}