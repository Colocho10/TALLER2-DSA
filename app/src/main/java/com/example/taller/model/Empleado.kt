package com.example.taller.model

class Empleado(val nombre: String, val Sbase: Double) {

    fun SalarioNetoC(): Double{

        val Descuento =  Sbase *0.12
        return Sbase - Descuento
    }
}