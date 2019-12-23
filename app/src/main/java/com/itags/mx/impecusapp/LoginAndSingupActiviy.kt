package com.itags.mx.impecusapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.itags.mx.impecusapp.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_login_and_singup.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity
import android.widget.Button as Button

class LoginAndSingupActiviy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_and_singup)

        btnLoginStart.setOnClickListener {
            startActivity(intentFor<LoginActivity>())
        }

        btnSingUp.setOnClickListener {
            startActivity(intentFor<SingupActivity>())
        }
    }


}
