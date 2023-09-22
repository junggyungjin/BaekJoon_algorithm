package com.example.codingtest_0.question

fun main() {
    readln().split(" ").map { it.toInt() }.let {
        var (n, m) = it[0] to it[1]
        var array = IntArray(n)
        for (i in 1..n) {
            array.set(i - 1, i)
        }
        repeat(m) {
            readln().split(" ").map { it.toInt() }.let {
                var (i,j) = it[0] to it[1]
                val temp = array[i - 1]
                array.set(i - 1, array[j - 1])
                array.set(j - 1, temp)
            }
        }
        print(array.joinToString(" "))
    }
}

/**
 * 이거 꼭 블로그에 정리하자. 이번주안에!!!!!!!!!!!!!!!!!!!!!!!!!
 */