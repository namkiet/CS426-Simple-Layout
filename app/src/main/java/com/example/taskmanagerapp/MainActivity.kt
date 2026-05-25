package com.example.taskmanagerapp

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val t1 = findViewById<View>(R.id.task_1)
        t1.findViewById<TextView>(R.id.task_title).text = "Buy groceries"
        t1.findViewById<TextView>(R.id.task_priority).apply {
            text = "High Priority"
            setTextColor(resources.getColor(R.color.priority_high, null))
        }
        t1.findViewById<TextView>(R.id.task_date).text = "May 20, 2024"

        val t2 = findViewById<View>(R.id.task_2)
        t2.findViewById<TextView>(R.id.task_title).text = "Finish Android project"
        t2.findViewById<TextView>(R.id.task_priority).apply {
            text = "Medium Priority"
            setTextColor(resources.getColor(R.color.priority_medium, null))
        }
        t2.findViewById<TextView>(R.id.task_date).text = "May 18, 2024"
        t2.findViewById<CheckBox>(R.id.task_checkbox).isChecked = true

        val t3 = findViewById<View>(R.id.task_3)
        t3.findViewById<TextView>(R.id.task_title).text = "Read a book"
        t3.findViewById<TextView>(R.id.task_priority).apply {
            text = "Low Priority"
            setTextColor(resources.getColor(R.color.priority_low, null))
        }
        t3.findViewById<TextView>(R.id.task_date).text = "May 25, 2024"
    }
}