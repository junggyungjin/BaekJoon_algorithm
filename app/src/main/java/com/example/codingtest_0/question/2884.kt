package com.example.codingtest_0.question

fun main(args: Array<String>) {
    val input = readLine()!!.split(" ").map { it.toInt() }.let {
        var h = (((it[0] * 60) + it[1]) - 45) / 60
        val y = (((it[0] * 60) + it[1]) - 45) % 60

        if (y < 0) {
            println("23 ${it[1] + 15}")
        } else {
            println("$h $y")
        }

    }
}