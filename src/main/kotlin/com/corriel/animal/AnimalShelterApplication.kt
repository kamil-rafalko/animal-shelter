package com.corriel.animal

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AnimalShelterApplication

fun main(args: Array<String>) {
    SpringApplication.run(AnimalShelterApplication::class.java, *args)
}
