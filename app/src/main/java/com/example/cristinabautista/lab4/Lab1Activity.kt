package com.example.cristinabautista.lab4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Lab1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab1)

        val lab2Web = findViewById<WebView>(R.id.webLab2)
        lab2Web.loadUrl("https://github.com/Crismaria11/PlataformasMoviles.git")
    }
}
