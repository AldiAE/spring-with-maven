package com.aldi.microservice.controllers.apiweb

import com.aldi.microservice.models.WebResponse
import com.aldi.microservice.models.apiweb.about.AboutResponse
import com.aldi.microservice.models.apiweb.about.CreateAboutRequest
import com.aldi.microservice.models.apiweb.about.ListAboutRequest
import com.aldi.microservice.models.apiweb.about.UpdateAboutRequest
import com.aldi.microservice.services.apiweb.AboutService
import org.springframework.web.bind.annotation.*

@RestController
class AboutController(val aboutService: AboutService) {

    @PostMapping(
        value = ["/api/personalweb/abouts"],
        produces = ["application/json"],
        consumes =  ["application/json"]
    )
    fun createAbout(@RequestBody body: CreateAboutRequest): WebResponse<AboutResponse> {
        val aboutResponse = aboutService.create(body)
        return WebResponse(
            code = 200,
            status = "OK",
            data = aboutResponse
        )
    }

    @GetMapping(
        value = ["/api/personalweb/abouts/{idAbout}"],
        produces = ["application/json"]
    )
    fun getAbout(@PathVariable("idAbout") id: String): WebResponse<AboutResponse> {
        val aboutResponse = aboutService.get(id)
        return WebResponse(
            code = 200,
            status = "OK",
            data = aboutResponse
        )
    }

    @PutMapping(
        value = ["/api/personalweb/abouts/{idAbout}"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateAbout(@PathVariable("idAbout") id: String,
                   @RequestBody updateAboutRequest: UpdateAboutRequest
    ): WebResponse<AboutResponse> {
        val aboutResponse = aboutService.update(id, updateAboutRequest)
        return WebResponse(
            code = 200,
            status = "OK",
            data = aboutResponse
        )
    }

    @DeleteMapping(
        value = ["/api/personalweb/abouts/{idAbout}"],
        produces = ["application/json"]
    )
    fun deleteAbout(@PathVariable("idAbout") id: String): WebResponse<String> {
        aboutService.delete(id)
        return WebResponse(
            code = 200,
            status = "OK",
            data = id
        )
    }

    @GetMapping(
        value = ["/api/personalweb/abouts"],
        produces = ["application/json"]
    )
    fun listAbouts(@RequestParam(value = "size", defaultValue = "10") size: Int,
                  @RequestParam(value = "page", defaultValue = "0") page: Int): WebResponse<List<AboutResponse>> {
        val request = ListAboutRequest(page = page, size = size)
        val responses = aboutService.list(request)
        return WebResponse(
            code = 200,
            status = "OK",
            data = responses
        )
    }
}