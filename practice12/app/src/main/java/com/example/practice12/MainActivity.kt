package com.example.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickChonSeokRadioButton(view: View){
        val imageFruit : ImageView = findViewById(R.id.imageView)
        imageFruit.setImageResource(R.drawable.acterchonseok)
        val radioButtonOther1 : RadioButton = findViewById(R.id.radioButton3)
        val radioButtonOther2 :RadioButton = findViewById(R.id.radioButton2)
        radioButtonOther1.isChecked = false
        radioButtonOther2.isChecked = false
    }
    fun clickGonYuRadioButton(view: View){
        val imageFruit : ImageView = findViewById(R.id.imageView)
        imageFruit.setImageResource(R.drawable.actergonyu)
        val radioButtonOther1 : RadioButton = findViewById(R.id.radioButton1)
        val radioButtonOther2 :RadioButton = findViewById(R.id.radioButton3)
        radioButtonOther1.isChecked = false
        radioButtonOther2.isChecked = false
    }
    fun clickInYeopRadioButton(view: View){
        val imageFruit : ImageView = findViewById(R.id.imageView)
        imageFruit.setImageResource(R.drawable.acterinyuop)
        val radioButtonOther1 : RadioButton = findViewById(R.id.radioButton1)
        val radioButtonOther2 :RadioButton = findViewById(R.id.radioButton2)
        radioButtonOther1.isChecked = false
        radioButtonOther2.isChecked = false
    }



    fun clickChonSeokCheckBox(view: View){
        val checkBox :CheckBox = findViewById(R.id.checkBox)
        val imageFruit :ImageView = findViewById(R.id.imageView2)
        if(checkBox.isChecked){
            imageFruit.setImageResource(R.drawable.acterchonseok)
        }
        else{
            imageFruit.setImageResource(0)
        }
    }
    fun clickGonYuCheckBox(view: View){
        val checkBox :CheckBox = findViewById(R.id.checkBox2)
        val imageFruit :ImageView = findViewById(R.id.imageView3)
        if(checkBox.isChecked){
            imageFruit.setImageResource(R.drawable.actergonyu)
        }
        else{
            imageFruit.setImageResource(0)
        }
    }
    fun clickInYeopCheckBox(view: View){
        val checkBox :CheckBox = findViewById(R.id.checkBox3)
        val imageFruit :ImageView = findViewById(R.id.imageView4)
        if(checkBox.isChecked){
            imageFruit.setImageResource(R.drawable.acterinyuop)
        }
        else{
            imageFruit.setImageResource(0)
        }
    }
}