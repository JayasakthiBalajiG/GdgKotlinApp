package com.example.gdgkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter (private val movieList: List<Movie>): RecyclerView.Adapter<MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.movie_adapter,parent,false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie=movieList[position]
        holder.imageView.setImageResource(movie.poster)
        holder.movieGenre.text=movie.movieGenre
        holder.movieName.text=movie.movieName
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}