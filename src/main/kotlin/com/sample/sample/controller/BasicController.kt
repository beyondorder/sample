package com.sample.sample.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BasicController {

    @Operation(summary = "Find User By ID", description = "Find User By ID")
    @ApiResponse(responseCode = "200", description = "OK")
    @GetMapping("/")
    fun basic():String{
        return "hello~"
    }


}