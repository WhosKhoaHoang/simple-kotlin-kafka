package com.example.simplekotlinkafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleKotlinKafkaApplication

fun main(args: Array<String>) {
	runApplication<SimpleKotlinKafkaApplication>(*args)
}
