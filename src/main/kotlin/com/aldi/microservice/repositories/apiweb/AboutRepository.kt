package com.aldi.microservice.repositories.apiweb

import com.aldi.microservice.entities.apiweb.About
import org.springframework.data.jpa.repository.JpaRepository

interface AboutRepository: JpaRepository<About, String> {
}