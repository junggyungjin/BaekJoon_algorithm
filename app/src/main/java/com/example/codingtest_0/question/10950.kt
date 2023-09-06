package com.example.codingtest_0.question

fun main(args: Array<String>) {
    val t = readLine()!!.toInt()
    var mutableList = mutableListOf<Int>()
    for (i in 0 until t) {
        mutableList.add(readLine()!!.split(" ").map { it.toInt() }.let { it[0] + it[1] })
    }
    mutableList.forEach { i ->
        println(i)
    }
}