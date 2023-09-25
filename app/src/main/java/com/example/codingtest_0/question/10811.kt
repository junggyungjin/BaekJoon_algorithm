package com.example.codingtest_0.question

fun main() {
    readln().split(" ").map { it.toInt() }.let {
        var (n,m)  = it[0] to it[1]
        var array = Array(n) {it+1}
        repeat(m) {
            readln().split(" ").map { it.toInt() }.let {
                var (i,j) = it[0]-1 to it[1]
                array.reverse(i,j)
            }
        }
        print(array.joinToString(" "))
    }
}