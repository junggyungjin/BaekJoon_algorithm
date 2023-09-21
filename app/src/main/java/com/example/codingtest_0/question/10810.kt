package com.example.codingtest_0.question

fun main() {
    var list = mutableListOf<Int>()
    readln().split(" ").map { it.toInt() }.let {
        var (n,m) = it[0] to it[1]
        repeat(n) {
            list.add(0)
        }
        repeat(m) {
            readln().split(" ").map { it.toInt() }.let {
                for (i in it[0].. it[1]) {
                    list.set(i-1,it[2])
                }
            }
        }
    }
    list.forEach { print("$it ") }
}