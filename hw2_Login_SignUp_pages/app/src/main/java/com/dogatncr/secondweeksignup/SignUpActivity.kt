package com.dogatncr.secondweeksignup

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class SignUpActivity : AppCompatActivity() {
    //variable definition
    private lateinit var SignUpChangePasswordVisibility: ImageView
    private var isVisibilityOn = false
    private lateinit var SignUpChangePasswordVisibility2 : ImageView
    private var isVisibilityOn2 = false
    private lateinit var SignUpPasswordVisibility : EditText
    private lateinit var SignUpPasswordVisibility2 : EditText
    private lateinit var arrowBackicon : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        //accessing view elements
        SignUpChangePasswordVisibility  = findViewById(R.id.SignUpShowPassword)
        SignUpChangePasswordVisibility2  = findViewById(R.id.SignUpShowPassword2)
        SignUpPasswordVisibility = findViewById(R.id.SignUpPassword)
        SignUpPasswordVisibility2 = findViewById(R.id.SignUpPassword2)
        arrowBackicon = findViewById(R.id.backArrow)

        //setting up visibility button listeners
        SignUpChangePasswordVisibility.setOnClickListener {
            if (isVisibilityOn) {
                SignUpChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_24)
                SignUpPasswordVisibility.transformationMethod = PasswordTransformationMethod.getInstance()
                isVisibilityOn = false
            } else {
                SignUpChangePasswordVisibility.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                SignUpPasswordVisibility.transformationMethod = HideReturnsTransformationMethod.getInstance()
                isVisibilityOn = true
            }
        }
        SignUpChangePasswordVisibility2.setOnClickListener {
            if (isVisibilityOn2) {
                SignUpChangePasswordVisibility2.setImageResource(R.drawable.ic_baseline_visibility_24)
                SignUpPasswordVisibility2.transformationMethod = PasswordTransformationMethod.getInstance()
                isVisibilityOn2 = false
            } else {
                SignUpChangePasswordVisibility2.setImageResource(R.drawable.ic_baseline_visibility_off_24)
                SignUpPasswordVisibility2.transformationMethod = HideReturnsTransformationMethod.getInstance()
                isVisibilityOn2 = true
            }
        }

        //go back button which triggers back button press
        arrowBackicon.setOnClickListener {
            super.onBackPressed()
        }

    }

}

