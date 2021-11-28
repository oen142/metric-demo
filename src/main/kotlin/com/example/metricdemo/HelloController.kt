package com.example.metricdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class HelloController {

    @GetMapping("/hello")
    fun world(): String {
        return "world"
    }

}