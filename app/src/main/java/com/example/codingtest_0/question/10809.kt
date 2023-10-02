package com.example.codingtest_0.question

fun main() {
    val input = readln()
    val result = IntArray(26) { -1 }

    for (i in input.indices) {
        val index = input[i] - 'a'
        if (result[index] == -1) {
            result[index] = i
        }
    }

    result.forEach { print("$it ") }
}