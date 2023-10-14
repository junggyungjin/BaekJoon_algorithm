package com.example.codingtest_0.question

fun main() {
    var list = mutableListOf("c=","c-","dz=","d-","lj","nj","s=","z=")
    readln().let {
        var result = it
        for (i in list.indices) {
            if (it.contains(list[i])) {
                result = result.replace(list[i],"a")
            }
        }
        print(result.length)
    }
}

private fun shortCoding() = print(readln().replace(Regex("c=|c-|dz=|d-|lj|nj|s=|z="), " ").length)
