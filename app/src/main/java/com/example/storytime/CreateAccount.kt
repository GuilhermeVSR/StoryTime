package com.example.storytime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.create_account.*

class CreateAccount : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_account)

        buttonReturn.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        val id = view.id
        if(id == R.id.buttonReturn){
            handleButtonReturn()
        }
    }

    fun handleButtonReturn(){
        startActivity(Intent(this, LoginScreen::class.java))
    }
}