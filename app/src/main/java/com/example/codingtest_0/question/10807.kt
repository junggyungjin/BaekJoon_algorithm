package com.example.codingtest_0.question

fun main() {
    var count = 0
    var list = mutableListOf<Int>()
    var n = readln().toInt()
    readln().split(" ").map { it.toInt() }.let {
        for (i in 0 until n) {
            list.add(i,it[i])
        }
        readln().toInt().let { it1 ->
            list.forEach { it2 ->
                if (it2 == it1) count++
            }
            println(count)
        }
    }
}

private fun shortCoding() {
    readln()
    val nums = readln().split(" ")
    val v = readln()
    print(nums.count { it == v})
}