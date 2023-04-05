package com.example.taller.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.taller.R
import com.example.taller.controller.CalculadorC
import com.example.taller.controller.PromedioControl

class Calculadora : AppCompatActivity() {

    var x = CalculadorC()

        private lateinit var num1: EditText
        private lateinit var num2: EditText
        private lateinit var result: TextView


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_calculadora)



            num1 = findViewById(R.id.num1)
            num2 = findViewById(R.id.num2)
            result = findViewById(R.id.result)

            val sumBtn = findViewById<Button>(R.id.sum)
            sumBtn.setOnClickListener { calculate('+') }

            val subtractBtn = findViewById<Button>(R.id.subtract)
            subtractBtn.setOnClickListener { calculate('-') }

            val multiplyBtn = findViewById<Button>(R.id.multiply)
            multiplyBtn.setOnClickListener { calculate('*') }

            val divideBtn = findViewById<Button>(R.id.divide)
            divideBtn.setOnClickListener { calculate('/') }
        }

        private fun calculate(op: Char) {
            val Numero1 = num1.text.toString().toDouble()
            val n2 = num2.text.toString().toDouble()
            var res = 0.0


            when (op) {
                '+' -> res = Numero1 + n2
                '-' -> res = Numero1 - n2
                '*' -> res = Numero1 * n2
                '/' -> res = Numero1 / n2
            }

            result.text = "Resultado: $res"
        }
    }
