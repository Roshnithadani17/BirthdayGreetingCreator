package com.roshni.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdau_greeting)
        val name=intent.getStringExtra(NAME_EXTRA)
        val greeting = findViewById<TextView>(R.id.birthdayGreetings)
        greeting.text="Happy Birthday\n$name!"
    }
}