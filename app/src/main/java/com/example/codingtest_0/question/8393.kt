package com.example.codingtest_0.question

fun main(args: Array<String>) {
    val n = readLine()!!.toInt().let {
        println((1..it).sum())
    }
}