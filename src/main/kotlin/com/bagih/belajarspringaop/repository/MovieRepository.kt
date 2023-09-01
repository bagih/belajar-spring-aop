package com.bagih.belajarspringaop.repository

import org.springframework.stereotype.Repository

@Repository
class MovieRepository {
    fun getMovieDetails(): String{
        return "Movie Details"
    }
}