package com.example.gigsemployeremployeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class Upload : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnUploadBusinessLicence.setOnClickListener {
//            Toast.makeText(baseContext,Upload,Toast.LENGTH_LONG).show()
        }
    }
}

class Register : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRegister.setOnClickListener {
           var fullname=etFullName.text.toString()
            var companyName=tvCompanyName.text.toString()
            var email=etEmail.text.toString()
            var location=etLocation.text.toString()
            var contact=etContact.text.toString()
//            Toast.make-Text(baseContext,fullname,companyName,email,location,contact,Toast.LENGTH_LONG).show()
        }
    }
}
