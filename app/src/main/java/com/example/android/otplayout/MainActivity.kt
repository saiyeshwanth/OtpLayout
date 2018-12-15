package com.example.android.otplayout

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hint = intent.getStringExtra("hint")
        b1.setOnClickListener {
            val i1 = Intent(this@MainActivity, ManualVerification::class.java)
            i1.putExtra("hint", hint)
            startActivity(i1)
        }


    }
}
