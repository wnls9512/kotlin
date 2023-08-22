package com.example.myapplication.kotlin

// Iterable
fun main(array: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //방법 1
    for (item in a) {
        println(item)
    }

    //방법 2
    for ((index, item) in a.withIndex()) {
        println("index : " + index + " value : " + item)
    }

    //방법 3
    a.forEach {
        println(it)
    }

    //방법 4
    a.forEach { item ->
        println(item)
    }

    //방법 5
    a.forEachIndexed { index, item ->
        println("index : " + index + " value : " + item)
    }

    //방법 6
    for (i in 0 until a.size){
        //until은 마지막을 포함하지 않는다
        // 0부터 8까지
        println(a.get(i))
    }

    //방법 7
    for(i in 0 until a.size step (2)){
        println(a.get(i))
    }

    //방법 8
    for (i in a.size-1 downTo (0)){
        //8부터 0까지 , 순서 반대로
        println(a[i])
    }

    //방법 9
    for (i in a.size-1 downTo (0) step (2)){
        //8부터 0까지 , 순서 반대로
        println(a[i])
    }

    //방법 10
    // ..(마지막 포함) != until(마지막 제외)
    for(i in 0..a.size-1) {
        println(a[i])
    }

    // 방법 11
    var b:Int =0;
    var c:Int =4;
    while (b<c){
        b++
        println("b")
    }

    // 방법 12
    do {
        println("hello")
    } while (b > c)
}