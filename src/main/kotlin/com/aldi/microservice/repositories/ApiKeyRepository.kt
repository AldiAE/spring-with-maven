package com.aldi.microservice.repositories

import com.aldi.microservice.entities.ApiKey
import org.springframework.data.jpa.repository.JpaRepository

interface ApiKeyRepository : JpaRepository<ApiKey, String> {
}