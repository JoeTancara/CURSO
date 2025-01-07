package com.joedev.curso.sintaxis

fun main(){

    var nam: String = "Joe"

    val dias= arrayOf("lunes", "martes", "miercoles", "jueves", "vierenes", "sabado", "domingo")
    //tamaño
    println(dias.size)
    //posiciones
    println(dias[1])
    //modificar valor de la posicion
    dias[0]="joeeee"
    println(dias[0])
    //mostrar toda la lista
    for (position in dias.indices){
        println(dias[position])
    }
}