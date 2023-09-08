package com.example.codingtest_0.question

fun main(args: Array<String>) {
    var total = readLine()!!.toInt()
    var sum = 0
    var n = readLine()!!.toInt().let {
        for (i in 0 until it) {
            readLine()!!.split(" ").map { it.toInt() }.let {
                sum += it[0]*it[1]
            }
        }
        if (sum==total) println("Yes") else println("No")
    }
}