package com.aldi.microservice.services.apiweb

import com.aldi.microservice.models.apiweb.about.AboutResponse
import com.aldi.microservice.models.apiweb.about.CreateAboutRequest
import com.aldi.microservice.models.apiweb.about.ListAboutRequest
import com.aldi.microservice.models.apiweb.about.UpdateAboutRequest

interface AboutService {

    fun create(createAboutRequest: CreateAboutRequest): AboutResponse

    fun get(id: String): AboutResponse

    fun update(id: String, updateAboutRequest: UpdateAboutRequest): AboutResponse

    fun delete(id: String)

    fun list(listAboutRequest: ListAboutRequest): List<AboutResponse>
}