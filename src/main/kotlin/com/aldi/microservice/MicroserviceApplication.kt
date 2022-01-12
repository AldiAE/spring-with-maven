package com.aldi.microservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroserviceApplication

fun main(args: Array<String>) {
	runApplication<MicroserviceApplication>(*args)
}
