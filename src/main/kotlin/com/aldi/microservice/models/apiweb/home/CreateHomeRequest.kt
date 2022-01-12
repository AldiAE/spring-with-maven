package com.aldi.microservice.models.apiweb.home

import javax.validation.constraints.NotBlank

data class CreateHomeRequest (

    @field:NotBlank
    val name: String?,

    @field:NotBlank
    val short_about: String?

)