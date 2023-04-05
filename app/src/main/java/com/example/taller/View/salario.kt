package com.example.taller.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.taller.R
import com.example.taller.controller.Controller

class salario : AppCompatActivity() {


        private lateinit var nombreEditText: EditText
        private lateinit var salarioEditText: EditText
        private lateinit var calcularButton: Button
        private lateinit var resultadoTextView: TextView
        private lateinit var controlador: Controller


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_salario)

           /*ADQUISICION DE VARIABLES*/

            nombreEditText = findViewById(R.id.etnombre)
            salarioEditText = findViewById(R.id.etsalario)
            calcularButton = findViewById(R.id.btncalcular)
            resultadoTextView = findViewById(R.id.tvresultado)

            /*CALCULOS DE BOTONES*/

            calcularButton.setOnClickListener{



                val NAME = nombreEditText.text.toString()
                val SALARY = salarioEditText.text.toString().toDouble()
                val iss = SALARY * 0.03
                val afp = SALARY * 0.04
                val renta = SALARY * 0.05

                val SNeto = ((SALARY.toString().toDouble() - iss) - afp) - renta
                val RESULT = "$NAME su salario neto es de $SNeto"

                //val iss1 = SALARY - (SALARY * ISS / 100)

                resultadoTextView.setText(RESULT)

            }
        }
    }
