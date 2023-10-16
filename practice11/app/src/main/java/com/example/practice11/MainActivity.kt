package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var isChecked = false

    fun click(view:View) {
        val photo: ImageView = findViewById<ImageView>(R.id.imageView2);
        photo.setImageResource(R.drawable.picture2);
        if (isChecked) {
            photo.setImageResource(R.drawable.picture2)
            isChecked = !isChecked
        }
    }
        var click = false;

        fun onClickImage(view: View) {
            val imageBtn: ImageButton = findViewById(R.id.imageButton);
            if (click == false) {
                imageBtn.setImageResource(R.drawable.btn_check_buttonless_off);
                click = !click;
            } else {
                imageBtn.setImageResource(R.drawable.btn_check_buttonless_on);
                click = !click;
            }
        }
}