package com.example.codingtest_0.question

fun main()=readln().split(" ").map{it.reversed().toInt()}.let{print(it.max())}
