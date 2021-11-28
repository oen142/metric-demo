package com.example.metricdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MetricDemoApplication

fun main(args: Array<String>) {
    runApplication<MetricDemoApplication>(*args)
}
