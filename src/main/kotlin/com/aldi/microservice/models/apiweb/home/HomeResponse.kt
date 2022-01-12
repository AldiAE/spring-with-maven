package com.aldi.microservice.models.apiweb.home

import java.util.*

data class HomeResponse(

    val id: String?,

    val name: String,

    val short_about: String,

    val createdAt: Date,

    val updatedAt: Date?

)