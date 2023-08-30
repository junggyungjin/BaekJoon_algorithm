package com.example.codingtest_0.question

fun main(args: Array<String>) {
    val input = readLine()!!.split(" ").map { it.toLong() }

    println("${input[0]+input[1]+input[2]}")
}