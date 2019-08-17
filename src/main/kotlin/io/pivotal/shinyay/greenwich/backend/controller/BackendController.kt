package io.pivotal.shinyay.greenwich.backend.controller

import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/backend")
class BackendController (val environment: Environment){

    @GetMapping
    fun hello() = "Hello, Backend service on port: ${environment.getProperty("local.server.port")}"
}