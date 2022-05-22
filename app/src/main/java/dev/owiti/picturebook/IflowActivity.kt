package dev.owiti.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IflowActivity : AppCompatActivity() {
    lateinit var btnBack2:Button
    lateinit var btnNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iflow)
        btnBack2=findViewById(R.id.btnBack2)
        btnBack2.setOnClickListener {
            val intent= Intent(this,IsleActivity::class.java)
            startActivity(intent)
    }
        btnNext4=findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
      }
   }
}