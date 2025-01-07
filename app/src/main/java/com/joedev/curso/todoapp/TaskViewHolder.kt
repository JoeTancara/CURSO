package com.joedev.curso.todoapp

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.joedev.curso.R

class TaskViewHolder (view: View) : RecyclerView.ViewHolder(view){

    private val tvTask:TextView = view.findViewById(R.id.tvTask)
    private val cbTask:CheckBox = view.findViewById(R.id.cbTask)

    fun render(task: Task){

        if(task.isSelected){
            tvTask.paintFlags = tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        }else{
            tvTask.paintFlags = tvTask.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }
        tvTask.text = task.name
        cbTask.isChecked = task.isSelected


        val color = when(task.category){
            TaskCategory.Domingo -> R.color.domingo_category

            TaskCategory.Jueves -> R.color.jueves_category
            TaskCategory.Lunes -> R.color.lunes_category
            TaskCategory.Martes -> R.color.martes_category
            TaskCategory.Miercoles -> R.color.miercoles_category
            TaskCategory.Sabado -> R.color.sabado_category
            TaskCategory.Viernes -> R.color.viernes_category
            }
        cbTask.buttonTintList = ColorStateList.valueOf(
            ContextCompat.getColor(cbTask.context, color)
        )
    }
}