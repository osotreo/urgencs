package com.example.urgencs

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton




   class hospital: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
            setContentView(R.layout.hospital)
            //info
            val txt_nombre=findViewById<EditText>(R.id.txt_nombre)
          val txt_codigo=findViewById<EditText>(R.id.txt_codigo)
         val txt_accidente=findViewById<EditText>(R.id.txt_accidente)


        //    boton_agregar.setOnClickListener {
        //try {
          // val codigo = txt_codigo.text.toString().toInt()
        //val nombre = txt_nombre.text.toString()
       // val accidente = txt_autor.text.toString()


        //    }
   //     }