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

        if(supportActionBar != null){
            supportActionBar!!.hide()
        }

        buttonReturn.setOnClickListener(this)
        buttonSubmitCreateAccount.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        val id = view.id
        if(id == R.id.buttonReturn){
            handleButtonReturn()
        }
        if(id == R.id.buttonSubmitCreateAccount){
            handleButtonSubmitCreateAccount()
        }
    }

    private fun handleButtonReturn(){
        startActivity(Intent(this, LoginScreen::class.java))
    }

    private fun handleButtonSubmitCreateAccount(){
        val name = userName.text.toString()
        val surname = userSurname.text.toString()
        val date = ((userBirthday.text.toString().substring(0, 2)) + (userBirthday.text.toString().substring(3, 5)) + (userBirthday.text.toString().substring(6, 10))).toInt()
        val email = userEmail.text.toString()
        val password = userPassword.text.toString()
    }
}