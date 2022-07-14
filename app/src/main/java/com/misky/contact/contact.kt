package com.misky.contact

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//class contact :AppCompatActivity(){
data class contact(
    var name:String,
    var email:String,
    var location:String,
//    var image:textView

    )
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)       //??
//
//    }
//    fun getExtras(){
//        val extras=intent.extras
//        val name=extras?.getString("NAME","")
//        val profile=extras?.getString("PROFILE","")
//        val email=extras?.getString("EMAIL","")
//        val location=extras?.getString("LOCATION","")
//
//        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
//
//
//
//
//    }
//}


