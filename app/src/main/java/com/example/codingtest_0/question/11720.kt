package com.example.codingtest_0.question

fun main() {
    readln()
    readln().toList().map { it.toString().toInt() }.let {
        print(it.sum())
    }
}

private fun shortCoding() {
    readln()
    print(readln().sumOf{it-'0'})
}