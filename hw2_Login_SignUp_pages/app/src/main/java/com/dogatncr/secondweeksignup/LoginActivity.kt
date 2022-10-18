package com.dogatncr.secondweeksignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView


class LoginActivity : AppCompatActivity() {
    //variable definition
    private lateinit var ivChangePasswordVisibility: ImageView
    private lateinit var passwordEditText: EditText
    private lateinit var LoginBtn : Button
    private lateinit var SignUpBtn : Button

    private var isVisibilityOn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //accessing view elements
        ivChangePasswordVisibility  = findViewById(R.id.ivShowPassword)
        passwordEditText  = findViewById(R.id.etPassword)
        LoginBtn = findViewById(R.id.btnLogin)
        SignUpBtn = findViewById(R.id.btnSignUp)

        //setting up visibility button listeners
        ivChangePasswordVisibility.setOnClickListener {
            if (isVisibilityOn) {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_24)
                passwordEditText.transformationMethod = PasswordTransformationMethod.getInstance()
                isVisibilityOn = false

            } else {
                ivChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                passwordEditText.transformationMethod = HideReturnsTransformationMethod.getInstance()
                isVisibilityOn = true
            }
        }
        LoginBtn.setOnClickListener {
            // todo login method will be implemented

        }
        //setting up sign up button which navigates to sign up activity
        SignUpBtn.setOnClickListener {
            val signUpIntent = Intent(this, SignUpActivity::class.java)
            startActivity(signUpIntent)

        }


    }

}