package com.example.myapplication.kotlin

//12. 배열

fun main(args: Array<String>) {

    // 배열 선언 방법 1
    var group1 = arrayOf<Int>(1,2,3,4,5)
    println(group1 is Array);

    // 배열 선언 방법 2 : 타입을 생략하면 여러 타입의 값을 하나의 배열에 넣을 수 있다
    var group2 = arrayOf(1,2,3.5,"Hello")

    //배열 값 꺼내기 1
    val result1 = group1.get(0)
    println(result1)

    //배열 값 꺼내기 2
    val result2 = group2[0]
    println(result2)

    //배열 값 바꾸기 1
    group1.set(0, 10)
    println(group1[0])

    //배열 값 바꾸기 2
    group1[0] = 200
    println(group1[0])
}