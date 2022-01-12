package com.aldi.microservice.models

data class WebResponse<T>(

    val code: Int,

    val status: String,

    val data: T
)