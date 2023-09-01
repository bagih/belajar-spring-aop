package com.bagih.belajarspringaop.service

import com.bagih.belajarspringaop.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class FilteringTechnique1(
    val repository: UserRepository
) {
    fun collaborativeFiltering(): String{
        return repository.getUserDetails()
    }
}