package com.example.storytime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_login_screen.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginScreen : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        if(supportActionBar != null){
            supportActionBar!!.hide()
        }


        createAccountButton.setOnClickListener(this)
        buttonSubmitLogin.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.createAccountButton) {
            handleCreateAccountButton()
        }
        if (id == R.id.buttonSubmitLogin){
            handleButtonSubmitLogin()
        }
    }

    private fun handleCreateAccountButton(){
        startActivity(Intent(this, CreateAccount::class.java))
    }

    private fun handleButtonSubmitLogin(){
        val login = login.text.toString()
        val password = password.text.toString()
        val remote = RetrofitClient.createService(UserService::class.java)
        val call : Call<LoginResponse> = remote.getUser(login, password)

        val response = call.enqueue(object : Callback<LoginResponse>{
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                val s = response.body()
                if (s != null) {
                    startActivity(Intent(this@LoginScreen, MainActivity::class.java).putExtra("fullName", s.fullName))
                }

            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                val s = t.message
            }

        })

    }
}