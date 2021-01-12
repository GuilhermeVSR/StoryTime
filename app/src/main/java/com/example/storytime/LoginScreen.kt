package com.example.storytime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login_screen.*

class LoginScreen : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        createAccountButton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.createAccountButton) {
            handleCreateAccountButton()
        }
    }

    fun handleCreateAccountButton(){
        startActivity(Intent(this, CreateAccount::class.java))
    }
}