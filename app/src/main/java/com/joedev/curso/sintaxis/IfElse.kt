package com.joedev.curso.sintaxis

fun main(){
    ifBasico()
    val sw: Boolean = true
    if(sw){
        println("verdadero")
    }

}
fun ifAnidado(){
    val animal = "oso"
    if(animal =="oso"){
        println("Si es perro")
    }else if(animal =="gato"){
        println("Si es gato")
    }else if(animal =="paajro"){
        println("Si es paajro")
    }
    else{
        println("No equivocado")
    }
}
fun ifBasico(){
    val name = "Joe"
    if(name =="Joe"){
        println("Si es igual")
    }
    else{
        println("No equivocado")
    }
}