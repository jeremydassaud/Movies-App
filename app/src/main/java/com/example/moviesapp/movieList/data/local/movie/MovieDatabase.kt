package com.example.moviesapp.movieList.data.local.movie

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.moviesapp.movieList.data.local.movie.MovieEntity

@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDatabase: RoomDatabase() {
    abstract val movieDao: MovieDao
}