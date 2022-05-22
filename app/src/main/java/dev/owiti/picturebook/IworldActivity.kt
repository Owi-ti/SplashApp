package dev.owiti.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IworldActivity : AppCompatActivity() {
    lateinit var btnBack:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iworld)
        btnBack=findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent=Intent(this,GymActivity::class.java)
            startActivity(intent)
        }
       btnNext2 = findViewById(R.id.btnNext2)
       btnNext2.setOnClickListener {
           val intent = Intent(this,IsleActivity::class.java)
           startActivity(intent)
        }

    }
}
