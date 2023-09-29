package com.example.codingtest_0.question

fun main() {
    readln().toInt().let {
        repeat(it) {
            readln().let {
                println("${it.first()}${it.last()}")
            }
        }
    }
}