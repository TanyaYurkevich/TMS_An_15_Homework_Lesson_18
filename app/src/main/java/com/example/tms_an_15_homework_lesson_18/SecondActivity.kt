package com.example.tms_an_15_homework_lesson_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var log: TextView
    lateinit var pass: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        log = findViewById(R.id.log)
        pass = findViewById(R.id.passw)

        val bundle = intent.extras
        println(bundle)
       if (bundle!=null) {
           log.text = "login = ${bundle.getString("log")}"
           pass.text = "password = ${bundle.getString("pass")}"
       }
    }
}
