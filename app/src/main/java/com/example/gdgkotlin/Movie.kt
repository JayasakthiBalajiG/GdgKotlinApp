package com.example.gdgkotlin

import androidx.annotation.DrawableRes

data class Movie(
    @DrawableRes val poster :Int,
    val movieName : String,
    val movieGenre : String,
)
