package com.joedev.curso.exerciises

fun main(){
    val n=51
    val nm=154
    mostrarSumaNotificaciones(n)
    mostrarSumaNotificaciones(nm)
}

fun mostrarSumaNotificaciones(num: Int){
    if(num >= 100){
        println("tienes mas de 99+ notificaciones")
    }else{
        println("tinees $num notitificaciones")
    }

}