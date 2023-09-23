package com.example.codingtest_0.question

fun main() {
//    var list = mutableListOf<Int>()
//    repeat(28) {
//        list.add(readln().toInt())
//    }
//    var result = mutableListOf<Int>()
//    for (i in 1..30) {
//        if (!list.contains(i)) {
//            result.add(i)
//        }
//    }
//    result.forEach { println(it) }
    shortCoding()
}

private fun shortCoding() {
    var array = Array(28) { readln().toInt() }
    print((1..30).filter { !array.contains(it) }.joinToString("\n"))
}