package com.bagih.belajarspringaop.service

import com.bagih.belajarspringaop.repository.MovieRepository
import org.springframework.stereotype.Service

@Service
class FilteringTechnique2(
    val repository: MovieRepository
) {
    fun contentBasedFiltering(): String {
        return repository.getMovieDetails()
    }
}