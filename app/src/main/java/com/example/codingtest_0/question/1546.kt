package com.example.codingtest_0.question

fun main() {
    readln().toInt().let {
        readln().split(" ").map { it.toFloat() }.let {
            val m = it.sorted().last()
            it.subList(0,it.lastIndex+1).map { it/m*100 }.let { print(it.average()) }
        }
    }
}