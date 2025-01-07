package com.joedev.curso.todoapp

sealed class TaskCategory(var isSelected:Boolean = true) {
    object Lunes :TaskCategory()
    object Martes :TaskCategory()
    object Miercoles :TaskCategory()
    object Jueves :TaskCategory()
    object Viernes :TaskCategory()
    object Sabado :TaskCategory()
    object Domingo :TaskCategory()

}