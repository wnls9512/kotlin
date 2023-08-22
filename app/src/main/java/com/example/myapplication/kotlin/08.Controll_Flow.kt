package com.example.myapplication.kotlin

// 08.제어 흐름
// 1. if/else
// 2. when

fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    // 1. if\else
    val max = if (a > b) {
        a
    } else {
        b
    }
    println(max)

    //2. when
    val value: Int = 3
//    when (value) {
//        1 -> {
//            println("value is 1")
//        }
//        2 -> {
//            println("value is 2")
//        }
//        3 -> {
//            println("value is 3")
//        }
//        else -> {
//            println("I do not know value")
//        }
//    }
    when (value) {
        1 -> println("value is 1")
        2 -> println("value is 2")
        3 -> println("value is 3")
        else -> println("I do not know value")
    }
    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 40
    }
    println(value2)
}