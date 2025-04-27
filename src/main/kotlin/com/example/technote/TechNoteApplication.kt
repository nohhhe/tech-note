package com.example.technote

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TechNoteApplication

fun main(args: Array<String>) {
    runApplication<TechNoteApplication>(*args)
}
