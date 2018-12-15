package com.example.android.otplayout

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_manual_verification.*


class ManualVerification : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual_verification)
        t123.text = intent.getStringExtra("hint")
    }
}

