package com.example.gdgkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.security.auth.login.LoginException

class MainActivity : AppCompatActivity() {
    private val TAG =MainActivity::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("kotlinStart", "onCreate: ", )
    }

    override fun onStart() {
        super.onStart()
        Log.e("kotlinStart", "onStart: ", )
    }

    override fun onStop() {
        super.onStop()
        Log.e("kotlinStart", "onStop: ", )
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("kotlinStart", "onRestart: ", )
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause: ", )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy: ", )
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume: ", )
    }
}