package com.example.codingtest_0.question

fun main(args: Array<String>) {
    readLine()!!.toInt().let {
        var stringBuilder = StringBuilder()
        if (it % 4 == 0) {
            stringBuilder.append("int")
            if (it / 4 >= 1) {
                for (i in 0 until it/4) {
                    stringBuilder.insert(0,"long ")
                }
            }
            println(stringBuilder.toString())
        }
    }
}

private fun shortCoding() {
    println("long ".repeat(readln().toInt()/4)+"int")
}