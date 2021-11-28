package com.example.metricdemo.endpoint.autoconfigure

import com.example.metricdemo.endpoint.TimeEndpoint
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class TimeEndpointConfiguration {

    @Bean
    fun timeEndPoint(): TimeEndpoint {
        return TimeEndpoint()
    }
    //30 : 48

}