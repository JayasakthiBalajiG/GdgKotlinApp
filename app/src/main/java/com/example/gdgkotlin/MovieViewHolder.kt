package com.example.gdgkotlin

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.movieImage)
    val movieName :TextView=itemView.findViewById(R.id.movieName)
    val movieGenre: TextView = itemView.findViewById(R.id.movieGenre)
}