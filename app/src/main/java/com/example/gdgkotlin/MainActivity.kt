package com.example.gdgkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import javax.security.auth.login.LoginException

class MainActivity : AppCompatActivity() {
    private val TAG =MainActivity::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val movieList = arrayListOf<Movie>(
            Movie(R.drawable.friends, "Friends", "Fun"),
            Movie(R.drawable.ready_player_one, "Ready Player One", "Adventure"),
            Movie(R.drawable.spidy_no_way_home, "Spider No Way Home", "Fiction"),
            Movie(R.drawable.thor_ragrarok, "Thor Ragnarok", "Fiction"),
            Movie(R.drawable.stranger_things, "Stranger Things", "Thriller"),
            Movie(R.drawable.dora_, "Dora and lost city of gold", "Kutties"),
            Movie(R.drawable.wakanda, "Black Panther", "Fiction"),
            Movie(R.drawable.junglebook, "Jungle Book", "Animation"),
            Movie(R.drawable.wonder_woman, "Wonder Woman", "Fiction"),
        )
        val adapter = MovieAdapter(movieList)
        findViewById<RecyclerView>(R.id.listView).adapter = adapter
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