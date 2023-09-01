package com.bagih.belajarspringaop.repository

import org.springframework.stereotype.Repository

@Repository
class UserRepository {
    fun getUserDetails(): String{
        return "User Details"
    }
}