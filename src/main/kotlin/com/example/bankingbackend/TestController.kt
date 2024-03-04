package com.example.bankingbackend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController

class TestController {

    @GetMapping("/home")
    fun getHomePage():String{
        return """
            <h1> Banking Backend </h1>
        """.trimIndent()
    }
}