package dev.owiti.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    lateinit var btnBack3:Button
    lateinit var btnNext5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btnBack3=findViewById(R.id.btnBack3)
        btnBack3.setOnClickListener {
            val intent= Intent(this,IflowActivity::class.java)
            startActivity(intent)
        }
        btnNext5=findViewById(R.id.btnNext5)
        btnNext5.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
     }
  }
   }