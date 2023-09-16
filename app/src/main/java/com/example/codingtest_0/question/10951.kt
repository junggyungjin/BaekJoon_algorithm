package com.example.codingtest_0.question

import java.util.Scanner

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    var input: String?
    while (readLine().also { input = it } != null) {
        input!!.split(" ").map { it.toInt() }.let {
            bw.write("${it[0] + it[1]}\n")
        }
    }
    bw.close()
}

private fun shortCoding() = with(Scanner(System.`in`)) {
    while (hasNext()) {
        println(nextInt()+nextInt())
    }
}