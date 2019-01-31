package com.example.cristinabautista.lab4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Lab2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab2)

        val lab3Web = findViewById<WebView>(R.id.webLab3)
        lab3Web.loadUrl("https://github.com/Crismaria11/Lab-3_Moviles.git")
    }
}
