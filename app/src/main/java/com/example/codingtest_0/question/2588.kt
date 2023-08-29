package com.example.codingtest_0.question

fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val b = readLine()!!

    for (i in 2 downTo 0) {
        println("${a * b[i].digitToInt()}")
    }
    println("${a * b.toInt()}")


}

/**
 * digitToInt : 문자 변수의 값이 숫자인 경우 digitToInt() 함수를 사용하여 명시적으로 Int 숫자로 변환할 수 있다.
 * for (i in 2 downTo 0) : 2부터 0까지 반복문을 역으로 돌린다.
 */