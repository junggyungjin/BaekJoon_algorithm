package com.example.codingtest_0.question

fun main()=readln().split(" ").let{
    if (it[0]==""&&it.last()=="") print(it.size-2) else if (it[0]==""||it.last()=="") print(it.size-1) else print(it.size)
}

private fun shortCoding() {
    readln().split(" ").count { it != "" }
}
