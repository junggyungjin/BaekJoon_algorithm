package com.example.codingtest_0.question

fun main() {
    var stop = true
    while (stop) {
        readln().split(" ").map { it.toInt() }.let {
            if (it[0] == 0 && it[1] == 0) {
                stop = false
            }else {
                println("${it[0]+it[1]}")
            }
        }
    }
}