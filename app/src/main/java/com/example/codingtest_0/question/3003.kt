package com.example.codingtest_0.question

fun main() {
    var list = listOf(1,1,2,2,2,8)
    readln().split(" ").map { it.toInt() }.let {
        for (i in list.indices) {
            print("${list[i]-it[i]} ")
        }
    }
}