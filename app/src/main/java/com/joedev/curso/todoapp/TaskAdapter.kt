package com.joedev.curso.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joedev.curso.R

class TaskAdapter(var task: List<Task>, private val onTaskSelected: (Int)-> Unit) :
    RecyclerView.Adapter<TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo_task, parent, false)
        return TaskViewHolder(view)
    }


    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.render(task [position])
        holder.itemView.setOnClickListener{onTaskSelected(position)}
    }

    override fun getItemCount()= task.size

}