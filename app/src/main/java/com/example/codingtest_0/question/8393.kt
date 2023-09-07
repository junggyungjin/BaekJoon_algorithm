package com.example.codingtest_0.question

fun main(args: Array<String>) {
    var sum = 0
    val n = readLine()!!.toInt().let {
        for (i in 0 .. it) {
            sum += i
        }
        println(sum)
    }
}