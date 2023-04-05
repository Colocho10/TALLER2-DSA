package com.example.taller.controller

import com.example.taller.model.Empleado

class Controller {

    fun Calculo_Salario (nombre: String, Salario_Base: Double):Double{

        val Laborador = Empleado(nombre,Salario_Base)
        return Laborador.SalarioNetoC()
    }
}