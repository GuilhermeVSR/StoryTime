package com.example.storytime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(supportActionBar != null){
            supportActionBar!!.hide()
        }

        val fullName = getIntent().getStringExtra("fullName")
        hello.setText("Bem vindo, $fullName")
    }

    override fun onClick(v: View) {
        TODO("Not yet implemented")
    }
}