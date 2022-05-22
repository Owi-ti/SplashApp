package dev.owiti.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IsleActivity : AppCompatActivity() {
    lateinit var btnBack1:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isle)
        btnBack1=findViewById(R.id.btnBack1)
        btnBack1.setOnClickListener {
            val intent=Intent(this,IworldActivity::class.java)
            startActivity(intent)
        }
        btnNext3=findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent=Intent(this,IflowActivity::class.java)
            startActivity(intent)
        }
    }
}