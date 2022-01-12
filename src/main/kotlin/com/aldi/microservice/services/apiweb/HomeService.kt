package com.aldi.microservice.services.apiweb

import com.aldi.microservice.models.apiweb.home.CreateHomeRequest
import com.aldi.microservice.models.apiweb.home.HomeResponse
import com.aldi.microservice.models.apiweb.home.ListHomeRequest
import com.aldi.microservice.models.apiweb.home.UpdateHomeRequest

interface HomeService {

    fun create(createHomeRequest: CreateHomeRequest):HomeResponse

    fun get(id: String): HomeResponse

    fun update(id: String, updateHomeRequest: UpdateHomeRequest): HomeResponse

    fun delete(id: String)

    fun list(listHomeRequest: ListHomeRequest): List<HomeResponse>
}