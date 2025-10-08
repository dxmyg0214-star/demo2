package com.example.demo2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnLinear).setOnClickListener {
            startActivity(Intent(this, LinearActivity::class.java))
        }
        findViewById<Button>(R.id.btnTable).setOnClickListener {
            startActivity(Intent(this, TableActivity::class.java))
        }
        findViewById<Button>(R.id.btnConstraint1).setOnClickListener {
            startActivity(Intent(this, Constraint1Activity::class.java))
        }
        findViewById<Button>(R.id.btnConstraint2).setOnClickListener {
            startActivity(Intent(this, Constraint2Activity::class.java))
        }
    }
}
