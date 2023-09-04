package com.example.codingtest_0.question

fun main(args: Array<String>) {
    var currentTime = readLine()!!.split(" ").map { it.toInt() }
    var cookTime = readLine()!!.toInt()
    var h = currentTime[0]
    var m = currentTime[1]

    if (m + cookTime >= 60) {
        val plusHour = (m+cookTime) / 60
        m = (m + cookTime) % 60
        if (h + plusHour >= 24) {
            h = (h+plusHour) % 24
        } else {
            h += plusHour
        }
    }else {
        m += cookTime
    }

    println("$h $m")

}