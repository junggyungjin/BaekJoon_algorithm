package com.example.codingtest_0.question

fun main(args: Array<String>) {
    val (x,y) = readLine()!!.toInt() to readLine()!!.toInt()

    println(if (x>0&&y>0) 1 else if (x<0&&y>0) 2 else if (x<0&&y<0) 3 else 4)
}