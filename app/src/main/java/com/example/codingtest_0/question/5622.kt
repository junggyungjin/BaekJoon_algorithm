package com.example.codingtest_0.question

fun main() {
    var count = 0
    for (char in readln()) {
        if ("ABC".contains(char)) {
            count += 3
        }else if ("DEF".contains(char)) {
            count += 4
        }else if ("GHI".contains(char)) {
            count += 5
        }else if ("JKL".contains(char)) {
            count += 6
        }else if ("MNO".contains(char)) {
            count += 7
        }else if ("PQRS".contains(char)) {
            count += 8
        }else if ("TUV".contains(char)) {
            count += 9
        }else if ("WXYZ".contains(char)) {
            count += 10
        }else {
            count += 2
        }
    }
    print(count)
}

private fun shortCoding() {
    val arr = arrayOf("", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ")
    var sum = 0
    readLine()!!.map { arr.forEachIndexed { i, e -> if (e.contains(it)) sum += i + 1 } }
    print(sum)
}