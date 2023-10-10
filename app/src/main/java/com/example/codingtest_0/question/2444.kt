package com.example.codingtest_0.question

fun main() {
    readln().toInt().let { n ->
        var m = 2*n-1
        for (i in 1..m) {
            if (i <= n) {
                for (j in n downTo 1) {
                    print(if (i >= j) "*" else " ")
                }
            }else {
                for (j in n..m) {
                    print(if (i > j) " " else "*")
                }
            }
            println("")
        }
    }

}

private fun chatGpt() {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        // 공백 출력
        for (j in 1..n - i) {
            print(" ")
        }
        // 별 출력
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }

//    for (i in n - 1 downTo 1) {
//        // 공백 출력
//        for (j in 1..n - i) {
//            print(" ")
//        }
//        // 별 출력
//        for (k in 1..(2 * i - 1)) {
//            print("*")
//        }
//        println()
//    }
}