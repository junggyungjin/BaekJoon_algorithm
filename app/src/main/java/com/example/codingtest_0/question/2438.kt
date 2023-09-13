package com.example.codingtest_0.question

fun main() {
    readln().toInt().let {
        for (i in 0 until  it) {
            for (j in 0..i) {
                print("*")
            }
            println("")
        }
    }
}

private fun shortCoding() = repeat(readln().toInt()){println("*".repeat(it+1))}