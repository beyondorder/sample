package com.sample.sample.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class V1config {

    @Bean
    fun basicBean(){
        println("RYAN BASIC BEAN")
    }
}