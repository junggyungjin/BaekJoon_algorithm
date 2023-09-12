package com.example.codingtest_0.question

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.write("Case #${it+1}: ${readLine().split(' ').map { it.toInt() }.let { 
            "${it[0]} + ${it[1]} = ${it[0] + it[1]}" }}\n"
        )
    }
    bw.close()
}