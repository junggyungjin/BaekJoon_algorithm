package com.example.codingtest_0.question

fun main(args: Array<String>) {
    val input = readLine()!!.split(" ").map { it.toInt() }.let {
        if (it[0] == it[1] && it[0] == it[2]) {
            println(10000 + it[0] * 1000)
        }else if (it[0] == it[1]) {
            println(1000 + it[0] * 100)
        }else if (it[0] == it[2]) {
            println(1000 + it[0] * 100)
        }else if (it[1] == it[2]) {
            println(1000 + it[1] * 100)
        }else if (it[0] != it[1] && it[0] != it[2] && it[1] != it[2]) {
            println(it.max()*100)
        }
    }
}