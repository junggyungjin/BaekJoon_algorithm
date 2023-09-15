package com.example.codingtest_0.question

fun main() {
    readln().toInt().let {
        for (i in 1 .. it) {
            for (j in it downTo 1) {
                print(if (i >= j) "*" else " ")
            }
            println("")
        }
    }
}