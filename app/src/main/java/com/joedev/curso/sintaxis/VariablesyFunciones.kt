package com.joedev.curso.sintaxis

//PUEDEN SER INVOCADAS DESDE DCUALQUIER PARTE DEL CODIGO
val global: Int = 50

fun main(){
    mostrarEdad(30)
    nombreCompleto("JOE", "TANCARA")
    val res = resta(123, 23)
    println("$res")
}
/**
** FUNCIONES
 */

fun resta(x:Int, y:Int):Int{
    return x - y
}
fun nombreCompleto(paterno: String, materno: String){
 println("Mi nombres es $paterno, $materno")
}
fun mostrarEdad(edad:Int){
    println("Mi edad es $edad")
}
fun variablesNumericas(){
    //VARIABLES
    //ENTEROS
    val num:Int = 10
    //LONG
    val x:Long = 20
    //FLOAT
    val floatExample:Float = 30.5f
    //DOUBLE
    val doubleExample:Double = 3232.3154
}
fun variableBooleanas(){
    //BOOOLEAN
    val sw:Boolean = false
    val sw2:Boolean = true
    //print(stringExample)
}
fun alfaNumeriocas(){
    /**
     * *VARIABLES ALFANUMERICOS
     */
    //CHAR     SE PUEDE PONER CUALQUIER CARACTER PERO SOLO UNO
    val charExample:Char = 'e'
    //STRING
    val stringExample:String = "Joe"
}