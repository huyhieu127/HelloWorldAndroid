package com.learn.helloworldandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
<<<<<<< HEAD
        setContentView(R.layout.intro_activity)
=======
        setContentView(R.layout.activity_main)
        println("Hello world!")
>>>>>>> 92e254ded7ba240390f60b62ced148a9aef6089b
    }
}