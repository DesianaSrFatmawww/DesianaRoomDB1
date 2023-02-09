package com.example.desianaroomdb1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        halEdit()
    }
    private fun halEdit(){
        btInput.setOnClickListener {
            startActivity(Intent(this,EditActivity::class.java))
        }
    }
}