package com.example.codingtest_0.question

fun main() {
    var nums = readln().split(" ").map { it.toInt() }
    readln().split(" ").map { it.toInt() }.filter { it < nums[1] }.let { it.forEach { print("$it ") } }
}