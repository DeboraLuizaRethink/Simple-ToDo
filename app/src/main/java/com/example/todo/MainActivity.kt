package com.example.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var list:List<String> = listOf()

        binding.btnAddAction.setOnClickListener {
            val Teste =  binding.editTextToDo.text.toString()
            list+= Teste
            binding.recyclerViewToDo.adapter = RecyclerViewAdapter(list)
        }


    }
}