package com.example.quiz2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btn_start)
        val etName : EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener{
 if (etName.text.isEmpty()){
     Toast.makeText(this, "Please enter your name ", Toast.LENGTH_LONG).show()
 }else{
     val intent = Intent(this,QuizQuestion::class.java)
     intent.putExtra(Constant.USER_NAME,etName.text.toString() )
     startActivity(intent)
     finish()
 }
        }

    }
}