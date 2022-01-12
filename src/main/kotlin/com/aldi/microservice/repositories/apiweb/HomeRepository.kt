package com.aldi.microservice.repositories.apiweb

import com.aldi.microservice.entities.apiweb.Home
import org.springframework.data.jpa.repository.JpaRepository

interface HomeRepository: JpaRepository<Home, String> {
}