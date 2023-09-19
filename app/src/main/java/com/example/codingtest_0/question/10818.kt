package com.example.codingtest_0.question

fun main() {
    readln()
    readln().split(" ").map { it.toInt() }.let {
        println("${it.min()} ${it.max()}")
    }
}