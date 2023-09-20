package com.example.codingtest_0.question

fun main() {
    var list = mutableListOf<Int>()
    repeat(9) {
        list.add(readln().toInt())
    }
    println(list.max())
    println(list.indexOf(list.max())+1)
}