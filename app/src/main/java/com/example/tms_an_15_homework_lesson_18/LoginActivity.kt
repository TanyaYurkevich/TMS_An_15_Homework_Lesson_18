package com.example.tms_an_15_homework_lesson_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var login: EditText
    lateinit var password: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login = findViewById(R.id.textPersonName)
        password = findViewById(R.id.textPassword)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val bundle = Bundle()
            if (login.length() >= 6 && password.length() >= 6){

            bundle.putString("log",login.text.toString())
            bundle.putString("pass", password.text.toString())
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)}

            else{
                Toast.makeText(this,"Password must be more than 6 characters", Toast.LENGTH_LONG).show()

            }
        }
    }
}