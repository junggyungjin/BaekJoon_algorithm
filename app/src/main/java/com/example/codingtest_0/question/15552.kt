package com.example.codingtest_0.question

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    readLine()!!.toInt().let {
        for (i in 0 until it) {
            readLine()!!.split(" ").map { it.toInt() }.let {
                writer.write("${it[0]+it[1]}\n")
            }
        }
        writer.flush()
        writer.close()
        close()
    }
}

fun shortCodding() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        bw.write("${readLine().split(' ').map { it.toInt() }.let { it[0] + it[1] }}\n")
    }
    bw.close()
}