package com.joedev.curso.sintaxis

fun main(){

}

fun rangos(ranggo:Int){
    when(ranggo){
        in 1 .. 6 -> println("Primer Semestre")
        in 7 .. 12 -> println("Segundo Semestre")
        !in 7 .. 12 -> println("Semestre no valido")
    }
}
fun getMonth(mes:Int){
    when(mes){
        1 -> println("enero")
        2 -> println("enero")
        3 -> println("enero")
        4 -> println("enero")
        5 -> println("enero")
        6 -> println("enero")
        7 -> println("enero")
        8 -> println("enero")
        9 -> println("enero")
        10 -> println("enero")
        11 -> {
            println("enero")
            println("enero")
            println("enero")
        }
        12 -> println("enero")
        else-> println("No existe el mes")
    }

    /**
     * NOS QUEDAMOS EMN EL MINUTO 2:09 SEGUNDOS
     */
}