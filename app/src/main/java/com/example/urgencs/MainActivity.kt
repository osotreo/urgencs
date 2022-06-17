package com.example.urgencs
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       // val bn_hospital_main=findViewById<AppCompatButton>(R.id.bn_hospital_main)
        //      bn_hospital_main.setOnClickListener {
          //  val intent= Intent(this,bn_hospital_main::class.java)
            startActivity(intent)
        }

    }
}