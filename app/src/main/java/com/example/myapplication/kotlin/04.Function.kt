package com.example.myapplication.kotlin

// 04. Function
/*
fun 함수명 (변수명:타입, 변수명:타입, ...) : 반환형 {
    return 반환 값
}
 */

// 기본 함수
fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// default 값을 갖는 함수
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수
//fun printPlus(first: Int, second: Int): Unit {
fun printPlus(first: Int, second: Int) {
    val result = first + second
    println(result);
}

// 함수를 축약해서 만들기
fun plusShort(first: Int, second: Int) = first + second

// 가변인자를 갖는 함수 선언
// vararg : 1개 ~ n개의 변수를 받을 수 있다
fun plusMany(vararg numbers: Int) {
    for (number in numbers){
        println(number)
    }
}

//내부 함수
fun showMyPlus(first: Int, second: Int) : Int {
//    println(first)
//    println(second)

    fun plus(first: Int, second: Int) : Int {
        return first + second
    }

    return plus(first, second)
}

fun main(array: Array<String>) {
    println(plus(1, 2))

    val result2 = plus(first = 20, second = 30)
    println(result2)

    val result3 = plusFive(3)
    println(result3)

    printPlus(10, 20)

    val result4 = plusShort(50, 50);
    println(result4)

    plusMany(1,2,3,4,5)

    val result5 = showMyPlus(1,2);
    println(result5)
}