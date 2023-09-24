package com.example.codingtest_0.question

fun main() = List(10) { readln().toInt() }.map { it % 42 }.let { print(it.toSet().size) }
