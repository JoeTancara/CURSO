package com.joedev.curso.todoapp

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.joedev.curso.R

class CategoriesViewHolder (view: View) : RecyclerView.ViewHolder(view){

    private val tvCategoryName:TextView = view.findViewById(R.id.tvCategoryName)
    private val divider:View = view.findViewById(R.id.divider)
    private val viewContainer:CardView = view.findViewById(R.id.viewContainer)

    fun render(taskCategory: TaskCategory, onItemSelected: (Int) -> Unit){

        val color = if(taskCategory.isSelected){
            R.color.background_card
        }else{
            R.color.background_disabled
        }
        viewContainer.setCardBackgroundColor(ContextCompat.getColor(viewContainer.context, color))
        itemView.setOnClickListener{onItemSelected(layoutPosition)}

        when(taskCategory){
            TaskCategory.Lunes -> {
                tvCategoryName.text="Lunes"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.lunes_category)
                )
            }
            TaskCategory.Martes -> {
                tvCategoryName.text="Martes"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.martes_category)
                )
            }
            TaskCategory.Miercoles -> {
                tvCategoryName.text="Miercoles"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.miercoles_category)
                )
            }
            TaskCategory.Jueves -> {
                tvCategoryName.text="Jueves"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.jueves_category)
                )
            }
            TaskCategory.Viernes -> {
                tvCategoryName.text="Viernes"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.viernes_category)
                )
            }
            TaskCategory.Sabado -> {
                tvCategoryName.text="Sabado"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.sabado_category)
                )
            }
            TaskCategory.Domingo ->{
                tvCategoryName.text="Domingo"
                divider.setBackgroundColor(
                    ContextCompat.getColor(divider.context, R.color.domingo_category)
                )
            }
        }
    }
}