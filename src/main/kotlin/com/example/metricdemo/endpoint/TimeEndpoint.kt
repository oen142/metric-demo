package com.example.metricdemo.endpoint

import org.springframework.boot.actuate.endpoint.annotation.Endpoint
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation
import java.time.LocalDateTime

@Endpoint(id = "time")
class TimeEndpoint {

    @ReadOperation
    fun getNow(): LocalDateTime {
        return LocalDateTime.now()
    }
}