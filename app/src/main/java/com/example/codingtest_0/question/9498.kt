package com.example.codingtest_0.question

/**
 * 문제
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 * 입력
 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 */

fun main(args: Array<String>) {
    val input = readLine()!!.toInt().let { input ->
        when(input) {
            in 90..100 -> println("A")
            in 80..89 -> println("B")
            in 70..79 -> println("C")
            in 60..69 -> println("D")
            else -> println("F")
        }
    }

}