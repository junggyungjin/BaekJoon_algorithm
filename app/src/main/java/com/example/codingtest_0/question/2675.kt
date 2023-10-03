package com.example.codingtest_0.question

fun main() {
    readln().toInt().let {
        repeat(it) {
            readln().split(" ").let {
                val inputString = it[1]
                val repeatedString = buildString {
                    for (char in inputString) {
                        repeat(it[0].toInt()) {
                            append(char)
                        }
                    }
                }
                println(repeatedString)
            }
        }
    }
}

//TODO 블로그에 정리!!