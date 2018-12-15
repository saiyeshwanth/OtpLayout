package com.example.android.otplayout

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_number.*

class number : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)


        send.setOnClickListener {
            val i = Intent(this@number, MainActivity::class.java)
            i.putExtra("hint", hint.text)
            startActivity(i)

        }

    }
}
