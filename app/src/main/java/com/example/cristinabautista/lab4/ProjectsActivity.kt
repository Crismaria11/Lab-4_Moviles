package com.example.cristinabautista.lab4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProjectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)
        // Hice que los botones funcionen al presionarlos para que lleven a las actividades las cuales llegaran
        // a sus respectivos links

        val buttonLab2 = findViewById<Button>(R.id.lab2Button)

        buttonLab2.setOnClickListener{val intentLab2 = Intent(this, Lab1Activity::class.java)
        startActivity(intentLab2)}


        val buttonLab3 = findViewById<Button>(R.id.lab3Button)

        buttonLab3.setOnClickListener{val intentLab3 = Intent(this, Lab2Activity::class.java)
        startActivity(intentLab3)}
    }
}
