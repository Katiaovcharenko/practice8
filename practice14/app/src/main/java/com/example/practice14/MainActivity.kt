package com.example.practice14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnClick(view: View) {
        val intent : Intent = Intent(this@MainActivity, MainInfo::class.java)
        val mailText : TextView = findViewById(R.id.editTextTextEmailAddress2)
        val nameText : TextView = findViewById(R.id.editTextText)
        val ageText : TextView = findViewById(R.id.editTextPhone)

        val mail = mailText.text.toString()
        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()

        intent.putExtra("name", name)
        intent.putExtra("e-mail", mail)
        intent.putExtra("age", age)

        when (view.id)
        {
            R.id.button -> startActivity(intent)
        }
    }
}