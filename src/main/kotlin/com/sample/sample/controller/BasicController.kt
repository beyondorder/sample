package com.sample.sample.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BasicController {

    @GetMapping("/")
    fun basic():String{
        return "hello~"
    }


}