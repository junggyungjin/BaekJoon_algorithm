package com.example.codingtest_0.question

fun main() {
    val input = readLine() ?: ""
    val frequencies = IntArray(26)

    for (char in input) {
        if (char.isLetter()) {
            val index = char.toLowerCase() - 'a'
            frequencies[index]++
        }
    }

    val maxFrequency = frequencies.max()
    val maxCount = frequencies.count { it == maxFrequency }

    if (maxCount == 1) {
        val maxIndex = frequencies.indexOf(maxFrequency)
        val maxChar = 'a' + maxIndex
        println(maxChar.toUpperCase())
    } else {
        println("?")
    }
}